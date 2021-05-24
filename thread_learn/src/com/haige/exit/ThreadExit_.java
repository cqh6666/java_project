package thread_learn.src.com.haige.exit;

/**
 * @className: com.haige.exit-> ThreadExit_
 * @description: main主线程停止其他线程
 * @author: cqh
 * @createDate: 2021-05-24 18:22
 * @version: 1.0
 * @todo:
 */
public class ThreadExit_ {
    public static void main(String[] args) {

        T t1 = new T();
        t1.start();

        //希望main控制t1线程的终止,必须可以修改loop变量
        // 让t1推出run方法，从而中止t1线程 -> 通知方式
        System.out.println("休眠10s结束线程...");
        try {
            Thread.sleep(10 * 1000);
            t1.setLoop(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class T extends Thread{
    private int count = 0;
    private boolean loop = true;

    @Override
    public void run() {

        while(loop){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((++count) + ":T 运行中...");


        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}