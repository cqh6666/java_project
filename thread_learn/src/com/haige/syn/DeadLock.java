package thread_learn.src.com.haige.syn;

/**
 * @className: thread_learn.src.com.haige.syn-> DeadLock
 * @description: 模拟线程死锁
 * @author: cqh
 * @createDate: 2021-05-25 9:08
 * @version: 1.0
 * @todo:
 */
public class DeadLock {
    public static void main(String[] args) {
        DeadLockDemo A = new DeadLockDemo(true);
        DeadLockDemo B = new DeadLockDemo(false);
        A.start();
        B.start();


    }
}


class DeadLockDemo extends Thread{
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() + " 进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + " 进入2");
                }
            }
        }else{
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}