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

        SellTicket01 SellTicket101 = new SellTicket01();
        SellTicket01 SellTicket102 = new SellTicket01();
        SellTicket01 SellTicket103 = new SellTicket01();

        new Thread(SellTicket101).start();
        new Thread(SellTicket102).start();
        new Thread(SellTicket103).start();
    }
}


//Thread
class SellTicket01 implements Runnable{
    private int ticketNum = 100; //多个线程共享
    private boolean loop = true;

    public synchronized void sell(){ //同步方法
        if ( ticketNum <= 0){
            System.out.println("售票结束");
            loop = false;
            return;
        }

        //休眠50毫秒
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                + " 剩余票数= " + (--ticketNum));
    }

    @Override
    public synchronized void run() {
        while (loop){
            sell(); //sell方法是一个同步方法
        }
    }
}