package thread_learn.src.com.haige.methods;

/**
 * @className: com.haige.methods-> ThreadMethod02
 * @description:
 *          yield与join方法的使用
 *             yield: 线程的让礼。让出cpu，让其他线程执行，但礼让的时间不确定，所以不一定礼让成功
 *             join: 线程的插队。插队的线程一旦插队成功，则肯定先执行完插入的线程所有的任务
 * @author: cqh
 * @createDate: 2021-05-24 21:06
 * @version: 1.0
 * @todo:
 */
public class ThreadMethod02 {
    public static void main(String[] args)  {
        TM2 tm2 = new TM2();
        tm2.start();


        for( int i =0; i < 10; i++){
            try {
                if ( i == 5){
                    System.out.println("我先让 "+tm2.getName()+" 线程执行完...");
                    // 线程插队
                    tm2.join();
                }
                System.out.println(i + ":hello, " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被 interrupt了!");
            }
        }


    }
}


class TM2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                System.out.println(i + ":hello, " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被 interrupt了!");
            }
        }
    }
}
