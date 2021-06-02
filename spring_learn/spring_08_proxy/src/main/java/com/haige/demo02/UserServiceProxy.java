package com.haige.demo02;

/**
 * @className: com.haige.demo2-> UserServiceProxy
 * @description: 代理模式
 * @author: cqh
 * @createDate: 2021-05-27 15:28
 * @version: 1.0
 * @todo:
 */
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void alter() {
        log("alter");
        userService.alter();
    }

    public void search() {
        log("search");
        userService.search();
    }

    public void log(String operation){
        System.out.println("[debug] 执行了一个"+ operation +"操作");
    }
}
