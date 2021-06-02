package com.haige.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @className: com.haige.pojo-> People
 * @description: 人
 * @author: cqh
 * @createDate: 2021-05-26 19:20
 * @version: 1.0
 * @todo:
 */
public class People {

    @Autowired(required = false)    // 如果显示的定义了Autowired的required为false，说明这个对象可以为null，否则不允许为空
    private Cat cat;
    @Resource
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
