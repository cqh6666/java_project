package com.haige.config;

import com.haige.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @className: com.haige.config-> HaiConfig
 * @description: 个人配置类
 * @author: cqh
 * @createDate: 2021-05-26 20:59
 * @version: 1.0
 * @todo:
 */

// 会被Spring容器托管，注册到容器中， 本来也是一个Component
// @Configuration 代表这是一个配置类
@Configuration
//@ComponentScan("com.haige.pojo")
@Import(HaiConfig2.class)
public class HaiConfig {

    // 相当于写的Bean标签
    // 这个方法的名字，相当于Bean标签的id属性
    // 这个方法的返回值，相当于Bean标签的class属性
    @Bean
    public User getUser(){
        return new User();
    }

}
