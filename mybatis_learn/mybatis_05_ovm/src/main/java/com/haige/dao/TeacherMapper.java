package com.haige.dao;

import com.haige.pojo.Teacher;

/**
 * @className: com.haige.dao-> TeacherMapper
 * @description:
 * @author: cqh
 * @createDate: 2021-06-01 16:05
 * @version: 1.0
 * @todo:
 */
public interface TeacherMapper {
    Teacher getTeacher();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacherById(int id);
}
