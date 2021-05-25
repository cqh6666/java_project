package thread_learn.src.com.haige.syn;

/**
 * @className: com.haige.ticket-> SellTicket1
 * @description: 多线程模拟三个窗口售票100张
 * @author: cqh
 * @createDate: 2021-05-24 18:07
 * @version: 1.0
 * @todo:
 */
public class SellTicket {
    public static void main(String[] args) {

        SellTicket01 sellticket01 = new SellTicket01();

        Thread thread01 = new Thread(sellticket01);
        Thread thread02 = new Thread(sellticket01);
        Thread thread03 = new Thread(sellticket01);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}


//Thread
class SellTicket01 implements Runnable{
    private int ticketNum = 100;
    private boolean loop = true;

    /**
     * 1. public synchronized void sell() {} 就是一个同步方法, 这时锁在this对象
     * 2. 也可以在代码块上写 synchronize， 同步代码块
     * 3. 同步方法（静态的）的锁为当前类本身
     *      public synchronized static void m1(){} 锁在SellTicket01.class
     * 4. 若在静态方法上，实现同步代码块
     *      public static void m2(){
     *          synchronized(SellTicket01.class){
     *              // code block
     *          }
     *      }
     */


    @Override
    public void run() {
        while (loop){
            synchronized (this) {
                if (ticketNum <= 0) {
                    System.out.println("售票结束");
                    loop = false;
                    return;
                }
                System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                        + " 剩余票数= " + (--ticketNum));
            }
            //休眠50毫秒
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}