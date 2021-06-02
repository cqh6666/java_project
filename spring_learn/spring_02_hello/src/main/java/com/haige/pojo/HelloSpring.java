package com.haige.pojo;

/**
 * @className: com.haige.pojo-> HelloSpring
 * @description: Your Business Objects
 * @author: cqh
 * @createDate: 2021-05-26 15:54
 * @version: 1.0
 * @todo:
 */
public class HelloSpring {
    public String name;

    public String getName() {
        return name;
    }
    // 利用set进行注入
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("Hello, " + name);
    }
}
