package com.haige.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @className: com.haige.log-> AfterLog
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 16:21
 * @version: 1.0
 * @todo:
 */
public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+ method.getName() + "返回结果为:" + returnValue);
    }
}
