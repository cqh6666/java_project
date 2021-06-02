package com.haige.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @className: com.haige.pojo-> Teacher
 * @description:
 * @author: cqh
 * @createDate: 2021-06-01 16:04
 * @version: 1.0
 * @todo:
 */
@Data
public class Teacher {
    private int id;
    private String name;

    private List<Student> students;
}
