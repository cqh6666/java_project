package com.haige.demo03;

import com.haige.demo02.UserService;
import com.haige.demo02.UserServiceImpl;

/**
 * @className: com.haige.demo03-> Client
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 16:01
 * @version: 1.0
 * @todo:
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        // 代理角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        proxyInvocationHandler.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.add();


    }
}
