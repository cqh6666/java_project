package com.haige.pojo;

/**
 * @className: com.com.com.haige.pojo-> User
 * @description:
 * @author: cqh
 * @createDate: 2021-05-30 18:17
 * @version: 1.0
 * @todo:
 */

public class User {
    private int id;
    private String name;
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
