package com.haige.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: com.haige.pojo-> User
 * @description:
 * @author: cqh
 * @createDate: 2021-06-02 21:34
 * @version: 1.0
 * @todo:
 */

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
