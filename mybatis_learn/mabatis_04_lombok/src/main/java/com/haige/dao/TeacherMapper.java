package com.haige.dao;

import com.haige.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    Teacher getTeacherById(int id);
}
