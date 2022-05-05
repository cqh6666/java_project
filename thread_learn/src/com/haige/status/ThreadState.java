package thread_learn.src.com.haige.status;

/**
 * @className: thread_learn.src.com.haige.status-> ThreadState
 * @description: 状态显示
 * @author: cqh
 * @createDate: 2021-05-24 22:17
 * @version: 1.0
 * @todo:
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        // 新建状态 NEW
        System.out.println(t.getName()+ " 状态 " + t.getState());

        // 调用start后 threadStatus不为0
        t.start();

        // 处于RUNNABLE状态的线程在Java虚拟机中运行，也有可能在等待CPU分配资源。
        while ( Thread.State.TERMINATED != t.getState()){
            System.out.println(t.getName()+ " 状态 " + t.getState());
            Thread.sleep(500);
        }

        // 终止状态
        System.out.println(t.getName()+ " 状态 " + t.getState());

    }
}

class T extends Thread{
    @Override
    public void run() {
        while(true){
            for(int i = 0;i<10;i++){
                System.out.println("hi, " + i);
                try {
                    // 会切换state为 TIMED_WAITING
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;

        }
    }
}