package com.haige.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @className: com.haige.log-> Log
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 16:16
 * @version: 1.0
 * @todo:
 */
public class BeforeLog implements MethodBeforeAdvice {

    // method : 要执行的目标对象的方法
    // objects: 参数
    // o : 目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
