package thread_learn.src.com.haige.use;

/**
 * @className: com.haige-> Thread01
 * @description: 通过继承thread类创建线程
 * @author: cqh
 * @createDate: 2021-05-24 16:20
 * @version: 1.0
 * @todo:
 */
public class Thread01 {
    public static void main(String[] args) {

        // 创建Cat对象 .var 快速定义变量
        Cat cat = new Cat();
        // 启动线程
        cat.start();
        /**
         * 读源码
         * public synchronized void start() {
         *     start0();
         * }
         * //本地方法，由JVM调用，底层是C/C++实现
         * //真正实现多线程的方法是 start0()
         * private native void start0();
         */

        // 当main线程启动一个子线程后， Thread-0 主线程不会阻塞
        // 这时 主线程 子线程会交替执行, 可以通过jConsole来监控线程使用情况
        System.out.println("主线程会继续执行..."+Thread.currentThread());
        for (int i=0; i < 50; i++){
            System.out.println("主线程i=" + i);
            //休眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

/**
 * 重写
 * @Override
 *     public void run() {
 *         if (target != null) {
 *             target.run();
 *         }
 *     }
 *
 */
class Cat extends Thread{

    int times = 0;
    @Override
    public void run() { // 重写run方法，自己的业务逻辑

        while(true) {
            //该线程每隔1秒，在控制台输出 喵喵，我是小猫咪 查看当前线程名
            System.out.println("喵喵，我是小猫咪"+ (++times) + "线程名=" + Thread.currentThread());

            // 休眠1秒 ctrl alt t
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80){
                break;
            }
        }
    }
}