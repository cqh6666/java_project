package com.haige.springboot_security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @className: com.haige.springboot_security.config-> SecurityConfig
 * @description:
 * @author: cqh
 * @createDate: 2021-06-10 19:35
 * @version: 1.0
 * @todo:
 */

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // 授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 首页所有人可以访问，但是功能页只有有权限的人才能访问

        http.authorizeRequests()
                .antMatchers("/", "/index").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");

        // 没有权限， 默认到登录页
        http.formLogin().loginPage("/toLogin").loginProcessingUrl("/login");

        // 注销失败可能原因
        http.csrf().disable();
        // 注销功能
        http.logout().logoutSuccessUrl("/");

        // 开启记住我 14days
        http.rememberMe().rememberMeParameter("remember");
    }

    // 认证
    // 密码编码 passwordEncoder  需要加密
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("admin")
                .password(new BCryptPasswordEncoder().encode("admin"))
                .roles("vip1","vip2","vip3")
                .and()
                .withUser("haige")
                .password(new BCryptPasswordEncoder().encode("haige123"))
                .roles("vip1","vip2")
                .and()
                .withUser("guest")
                .password(new BCryptPasswordEncoder().encode("123123"))
                .roles("vip1");
    }

}
