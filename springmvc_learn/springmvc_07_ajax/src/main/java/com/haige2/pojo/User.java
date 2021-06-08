package com.haige2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: com.haige.pojo-> User
 * @description: 用户类
 * @author: cqh
 * @createDate: 2021-06-08 10:24
 * @version: 1.0
 * @todo:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private String sex;
}
