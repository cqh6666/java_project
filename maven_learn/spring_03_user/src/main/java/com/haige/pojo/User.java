package com.haige.pojo;

/**
 * @className: com.haige.pojo-> User
 * @description: 用户实体类
 * @author: cqh
 * @createDate: 2021-05-26 16:43
 * @version: 1.0
 * @todo:
 */
public class User {
    private String name;

    public User() {
        System.out.println("无参构造");
    }

    public User(String name) {
        this.name = name;
        System.out.println("有参数构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("name = "+name);
    }
}
