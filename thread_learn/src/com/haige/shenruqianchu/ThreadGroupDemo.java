package com.haige.shenruqianchu;

/**
 * @className: com.haige.shenruqianchu-> ThreadGroupDemo
 * @description:
 * @author: cqh
 * @createDate: 2021-09-08 20:21
 * @version: 1.0
 * @todo:
 */

/**
 * 线程组对线程进行批量控制
 *  * Therad不能独立于ThreadGroup存在
 *  * 执行main方法线程的名字是main。
 * @author cqh
 */
public class ThreadGroupDemo {

    public static void main(String[] args) {
        Runnable target;
        Thread testThread = new Thread(() -> {
            System.out.println("testThread当前线程组名字: " + Thread.currentThread().getThreadGroup().getName());
            System.out.println("testThread当前线程名字: " + Thread.currentThread().getName());
        });

        testThread.start();

        System.out.println("main线程名字: "+ Thread.currentThread().getName());

    }
}
