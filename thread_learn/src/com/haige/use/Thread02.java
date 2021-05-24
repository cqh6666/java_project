package thread_learn.src.com.haige.use;

/**
 * @className: com.haige-> Thread02
 * @description: 若已经有继承的类，那么Thread又该如何使用呢？Runnable
 * @author: cqh
 * @createDate: 2021-05-24 17:04
 * @version: 1.0
 * @todo:
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // dog.start() 不能调用
        // 创建Thread对象， 把dog对象 放入 Thread
        // 底层使用了设计模式（代理模式）
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable{ //通过实现Runnable接口，开发线程

    int count=0;
    @Override
    public void run() {
        while(true){
            System.out.println("小狗汪汪叫..." + (++count) + Thread.currentThread());

            //休眠
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