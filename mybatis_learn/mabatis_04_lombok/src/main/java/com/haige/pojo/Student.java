package com.haige.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: com.haige.pojo-> Student
 * @description: 学生实体类
 * @author: cqh
 * @createDate: 2021-06-01 16:03
 * @version: 1.0
 * @todo:
 */

@Data
public class Student {
    private int id;
    private String name;
    //学生关联老师
    private Teacher teacher;
}
