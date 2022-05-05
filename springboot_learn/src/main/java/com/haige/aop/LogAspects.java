package com.haige.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @className: com.haige.aop-> LogAspects
 * @description:
 * @author: cqh
 * @createDate: 2022-04-26 11:56
 * @version: 1.0
 * @todo:
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.haige.service.CalculatorImpl.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("日志开始..." + name + "(" + Arrays.asList(args) + ")" );
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("日志结束..." + name + "(" + Arrays.asList(args) + ")" );
    }

    @AfterReturning(value = "pointCut()", returning = "returnValue")
    public void logReturn(JoinPoint joinPoint, Object returnValue){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("日志记录..." + name + "(" + Arrays.asList(args) + ")" + " 运行正常返回 " + returnValue);
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logError(JoinPoint joinPoint, Exception exception){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("日志记录..."  + name + "(" + Arrays.asList(args) + ")" + " 运行出现异常: " + exception);
    }
}
