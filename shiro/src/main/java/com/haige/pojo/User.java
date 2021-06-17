package com.haige.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: com.haige.pojo-> User
 * @description:
 * @author: cqh
 * @createDate: 2021-06-11 20:13
 * @version: 1.0
 * @todo:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
    private String perms;
}
