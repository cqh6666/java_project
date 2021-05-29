package com.haige.pojo;

/**
 * @className: com.haige.dao-> User
 * @description:
 * @author: cqh
 * @createDate: 2021-05-27 22:40
 * @version: 1.0
 * @todo:
 */
public class User {

    private int id;  //id
    private String name;   //姓名
    private String pwd;   //密码

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
