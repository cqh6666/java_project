package com.haige.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: com.haige.pojo-> User
 * @description:
 * @author: cqh
 * @createDate: 2021-06-10 18:17
 * @version: 1.0
 * @todo:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String pwd;
}
