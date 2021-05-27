package com.haige.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @className: com.haige.diy-> AnnotationPointCut
 * @description: 注解切入点
 * @author: cqh
 * @createDate: 2021-05-27 16:57
 * @version: 1.0
 * @todo:
 */

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.haige.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("利用注解 ------ 执行前...");
    }
    @After("execution(* com.haige.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("利用注解 ------ 执行后...");
    }

    @Around("execution(* com.haige.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:"+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
