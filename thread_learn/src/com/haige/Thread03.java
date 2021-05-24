package thread_learn.src.com.haige;

/**
 * @className: com.haige-> Thread03
 * @description: 多线程执行
 * @author: cqh
 * @createDate: 2021-05-24 17:23
 * @version: 1.0
 * @todo:
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();

    }
}


class T1 implements Runnable{

    int count = 0;
    @Override
    public void run() {
        while (true) {
            //每隔一秒钟输出hello world！
            System.out.println("t1:hello world! " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==10){
                break;
            }
        }
    }
}

class T2 implements Runnable{

    int count = 0;
    @Override
    public void run() {
        while (true) {

            //每隔一秒钟输出hello world！
            System.out.println("t2:hello world! " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count==10){
                break;
            }
        }
    }
}