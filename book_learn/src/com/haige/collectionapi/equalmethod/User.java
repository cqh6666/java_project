package com.haige.collectionapi.equalmethod;

import java.util.Objects;

/**
 * @className: com.haige.collectionapi.equalmethod-> User
 * @description: 用户类
 * @author: cqh
 * @createDate: 2021-05-27 10:28
 * @version: 1.0
 * @todo:
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        return (name.compareTo(user.name));
    }
}
