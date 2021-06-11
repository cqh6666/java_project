package com.haige.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: com.haige.pojo-> Department
 * @description: 部门
 * @author: cqh
 * @createDate: 2021-06-09 16:05
 * @version: 1.0
 * @todo:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private String departmentName;
}
