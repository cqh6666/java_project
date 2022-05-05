package com.haige.service;

import org.springframework.stereotype.Service;

/**
 * @className: com.haige.service-> CalculatorImpl
 * @description: aop使用方法
 * @author: cqh
 * @createDate: 2022-04-26 11:54
 * @version: 1.0
 * @todo:
 */
@Service
public class CalculatorImpl implements Calculator{

    @Override
    public int div(int i, int j) {

        try{
            System.out.println("开始进行除法运算...");
        }catch (ArithmeticException exception){
            throw exception;
        }

        return i / j;
    }
}
