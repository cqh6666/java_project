package com.haige;

/**
 * @className: com.haige-> entity
 * @description: 与数据库一一对应
 * @author: cqh
 * @createDate: 2021-05-29 15:39
 * @version: 1.0
 * @todo:
 */

public class People {
    private int id;
    private String name;
    private String pwd;

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public People(int id, String name, String pwd) {
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
