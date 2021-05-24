package src.com.haige.ticket;

/**
 * @className: com.haige.ticket-> SellTicket
 * @description: 多线程模拟三个窗口售票100张
 * @author: cqh
 * @createDate: 2021-05-24 18:07
 * @version: 1.0
 * @todo:
 */
public class SellTicket {
    public static void main(String[] args) {

        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }
}


//Thread
class SellTicket01 extends Thread{
    // 多个线程共享 num
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true){

            if ( ticketNum <= 0){
                System.out.println("售票结束");
                break;
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
    }
}