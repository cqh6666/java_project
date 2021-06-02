package com.haige.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @className: com.haige.pojo-> User
 * @description:
 * @author: cqh
 * @createDate: 2021-05-26 21:03
 * @version: 1.0
 * @todo:
 */

// 这个类被Spring接管了，注册到容器中
@Component
public class User {
    public String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
    @Value("海鸽")
    public void setName(String name) {
        this.name = name;
    }
}
