package thread_learn.src.com.haige.pratice;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import javax.swing.text.AbstractDocument;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @className: thread_learn.src.com.haige.pratice-> homework01
 * @description: main方法启动两个线程 第一个线程循环随机打印 直到第二个线程读取Q命令
 * @author: cqh
 * @createDate: 2021-05-25 9:23
 * @version: 1.0
 * @todo:
 */
public class homework01 {
    public static void main(String[] args) {
        Work01 work01 = new Work01();
        Work02 work02 = new Work02(work01);

        work01.start();
        work02.start();
    }

}


class Work01 extends Thread{
    private boolean flag = true;

    @Override
    public void run() {

        while(flag){
            ThreadLocalRandom ranNum = ThreadLocalRandom.current();
            System.out.println("当前随机数是: " + ranNum.nextInt(100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

class Work02 extends Thread{
    private Work01 work01;
    private Scanner scanner = new Scanner(System.in);

    public Work02(Work01 work01) {
        this.work01 = work01;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("请输入指令（Q结束）...");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q'){
                work01.setFlag(false);
                System.out.println("线程 "+ work01.getName() + " 已停止!");
                break;
            }
        }
    }
}