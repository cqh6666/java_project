package com.haige.service;

import com.haige.dao.EmployeeDao;
import com.haige.pojo.Employee;

import java.util.Collection;

/**
 * @className: com.haige.service-> EmployeeServiceImpl
 * @description:
 * @author: cqh
 * @createDate: 2021-06-09 20:41
 * @version: 1.0
 * @todo:
 */
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;
    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public Collection<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    public void add(Employee employee) {
        employeeDao.add(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeDao.deleteEmployee(id);
    }
}
