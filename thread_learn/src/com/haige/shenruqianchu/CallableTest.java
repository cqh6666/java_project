package com.haige.shenruqianchu;

import java.util.concurrent.*;

/**
 * @className: com.haige.shenruqianchu-> CallableTest
 * @description:
 * @author: cqh
 * @createDate: 2021-09-08 20:16
 * @version: 1.0
 * @todo:
 */
public class CallableTest implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return 2;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        CallableTest task = new CallableTest();
        Future<Integer> result = executor.submit(task);
        System.out.println(result.get());
    }
}
