package com.haige.interrupted;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @className: com.haige.interrupted-> InterrupTest
 * @description:
 * @author: cqh
 * @createDate: 2022-04-05 10:37
 * @version: 1.0
 * @todo:
 */
public class InterrupTest implements Runnable{
    @Override
    public void run() {
        try {
            while(true){
                boolean interrupted = Thread.currentThread().isInterrupted();
                System.out.println("interrupted status:" + interrupted);
                Thread.sleep(20000);
                System.out.println("interrupted status:" + interrupted);
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            boolean inter1 = Thread.interrupted();  // true
            boolean inter2 = Thread.interrupted();  // false

            System.out.println("catch interrupt status before:" + inter1);
            System.out.println("catch interrupt status after:" + inter2);
        }
    }

    public static void main(String[] args) {
        InterrupTest interrupTest = new InterrupTest();
        Thread thread = new Thread(interrupTest);
        thread.start();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("中断其他线程...");
        thread.interrupt();


    }
}
