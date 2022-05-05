package com.haige.status;

/**
 * @className: com.haige.status-> StateSwitch
 * @description:
 * @author: cqh
 * @createDate: 2021-12-19 15:12
 * @version: 1.0
 * @todo:
 */
public class StateSwitch {

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                StateSwitch.testMethod();
            }
        }, "A");

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                StateSwitch.testMethod();
            }
        }, "B");

        threadA.start();
        // 会睡眠，进入 TIMED_WAITING
//         Thread.sleep(1000L);

        // join会一直等待这个线程执行完毕（转换为TERMINATED状态）。
        threadA.join();
        threadB.start();

        System.out.println(threadA.getName() + ":" + threadA.getState());
        System.out.println(threadB.getName() + ":" + threadB.getState());
    }

    private static synchronized void testMethod(){
        try{
            Thread.sleep(2000L);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
