package thread_learn.src.com.haige.methods;

/**
 * @className: com.haige.methods-> ThreadMethod01
 * @description: interrupted方法使用,中断休眠
 * @author: cqh
 * @createDate: 2021-05-24 20:55
 * @version: 1.0
 * @todo:
 */
public class ThreadMethod01 {
    public static void main(String[] args) {
        TM1 t = new TM1();

        t.setName("海鸽");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        // 主线程 打印 5 个 hi，然后中断子线程的休眠
        for(int i =0; i<5; i++){
            try {
                Thread.sleep(1000);
                System.out.println("hi " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(t.getName() + " 线程的优先级 = " + t.getPriority());
        t.interrupt();
    }
}



class TM1 extends Thread{
    @Override
    public void run() {
        while(true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " 吃包子..." + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + " 休眠中...");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被 interrupt了!");
            }

        }
    }
}