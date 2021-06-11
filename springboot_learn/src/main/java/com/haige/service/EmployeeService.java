package com.haige.service;

import com.haige.pojo.Employee;

import java.util.Collection;

/**
 * @className: com.haige.service-> EmployeeService
 * @description:
 * @author: cqh
 * @createDate: 2021-06-09 20:41
 * @version: 1.0
 * @todo:
 */
public interface EmployeeService {
    Employee getEmployeeById(Integer id);
    Collection<Employee> getEmployees();
    void add(Employee employee);
    void deleteEmployee(Integer id);
}
