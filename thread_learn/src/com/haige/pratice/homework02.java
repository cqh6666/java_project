package thread_learn.src.com.haige.pratice;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @className: thread_learn.src.com.haige.pratice-> homework02
 * @description: 取款问题
 * @author: cqh
 * @createDate: 2021-05-25 9:44
 * @version: 1.0
 * @todo:
 */
public class homework02 {
    public static void main(String[] args) {
        People people = new People();
        Thread thread1 = new Thread(people);
        thread1.setName("t1");
        Thread thread2 = new Thread(people);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }
}


class People implements Runnable{

    private int money = 10000;

    @Override
    public void run() {
        while(true){
            //判断余额

            synchronized (this){
                if (money < 1000){
                    System.out.println("余额不足...");
                    break;
                }

                money -= 1000;
                System.out.println(Thread.currentThread().getName() + " 取走了1000块钱, 剩余余额 " + money);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}