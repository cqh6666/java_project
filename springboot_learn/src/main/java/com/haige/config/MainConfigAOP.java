package com.haige.config;

import com.haige.aop.LogAspects;
import com.haige.service.Calculator;
import com.haige.service.CalculatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @className: com.haige.config-> MainConfigAOP
 * @description:
 * @author: cqh
 * @createDate: 2022-04-26 12:09
 * @version: 1.0
 * @todo:
 */
@EnableAspectJAutoProxy //springboot默认开启的
@Configuration
public class MainConfigAOP {

    /**
     * 切面类得放入spring容器中
     * @return
     */
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }


}
