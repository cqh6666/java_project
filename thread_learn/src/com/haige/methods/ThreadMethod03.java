package thread_learn.src.com.haige.methods;

/**
 * @className: thread_learn.src.com.haige.methods-> ThreadMethod03
 * @description: 将一个线程设置成守护线程
 *      守护线程：当所有用户线程结束，守护线程自动结束
 * @author: cqh
 * @createDate: 2021-05-24 22:03
 * @version: 1.0
 * @todo:
 */
public class ThreadMethod03 {
    public static void main(String[] args) {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        // 如果我们希望当主线程结束后，子线程可以自动结束
        // 只需要将子线程设置为守护线程
        for( int i=1;i<= 10; i++){
            try {
                System.out.println(Thread.currentThread().getName() + ":我在工作中...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("我干完活了...");
    }
}


class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for( ; ; ){
            try {
                Thread.sleep(1000);
                System.out.println(this.getName() + ":我在偷懒...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}