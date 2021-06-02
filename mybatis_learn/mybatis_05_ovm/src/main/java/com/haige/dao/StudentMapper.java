package com.haige.dao;

import com.haige.pojo.Student;

import java.util.List;

/**
 * @className: com.haige.dao-> StudentMapper
 * @description:
 * @author: cqh
 * @createDate: 2021-06-01 16:05
 * @version: 1.0
 * @todo:
 */
public interface StudentMapper {

    //查询所有的学生信息，以及对应的老师信息
    List<Student> getStudent();
    List<Student> getStudent2();
}
