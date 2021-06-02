package com.haige.demo02;

/**
 * @className: com.haige.demo2-> Client
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 15:32
 * @version: 1.0
 * @todo:
 */
public class Client {
    public static void main(String[] args) {
        // 代理类
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        // 真实业务
        UserServiceImpl userService = new UserServiceImpl();
        // 使用代理模式
        userServiceProxy.setUserService(userService);
        // add操作 增加了log功能
        userServiceProxy.add();
    }

}
