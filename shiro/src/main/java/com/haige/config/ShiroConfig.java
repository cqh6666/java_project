package com.haige.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @className: com.haige.config-> ShiroConfig
 * @description:
 * @author: cqh
 * @createDate: 2021-06-11 17:03
 * @version: 1.0
 * @todo:
 */
@Configuration
public class ShiroConfig {

    // Bean 3
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        // 设置安全管理器
        factoryBean.setSecurityManager(defaultWebSecurityManager);
        /**
         * anno: 无需认证
         * authc: 必须认证
         * user: 必须拥有 记住我 才能用
         * perms: 拥有对某个资源的权限才能访问
         * role: 拥有某个角色权限
         */
        // 权限
        Map<String, String> filterMap = new LinkedHashMap<>();
        filterMap.put("/user/add","perms[user:add]");
        filterMap.put("/user/update","perms[user:update]");
        // filterMap.put("/user/*","authc");

        factoryBean.setFilterChainDefinitionMap(filterMap);
        factoryBean.setLoginUrl("/toLogin");
        factoryBean.setUnauthorizedUrl("/noauth");
        return factoryBean;
    }
    // Manager 2
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 关联UserRealm
        securityManager.setRealm(userRealm);
        return securityManager;
    }
    // realm 1
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }

    // 整合Shiro和thymeleaf
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
