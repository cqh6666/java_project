package com.haige.dao;

import com.haige.pojo.Department;
import com.haige.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: com.haige.dao-> EmployeeDao
 * @description: 员工
 * @author: cqh
 * @createDate: 2021-06-09 16:16
 * @version: 1.0
 * @todo:
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001,new Employee(1001, "AA", "2018ch@m.scnu.edu.cn", 1, new Department(101, "教学部")));
        employees.put(1002,new Employee(1002, "BB", "2018ch@m.scnu.edu.cn", 0, new Department(102, "市场部")));
        employees.put(1003,new Employee(1003, "CC", "2018ch@m.scnu.edu.cn", 1, new Department(103, "教研部")));
        employees.put(1004,new Employee(1004, "DD", "2018ch@m.scnu.edu.cn", 0, new Department(104, "运营部")));
        employees.put(1005,new Employee(1005, "EE", "2018ch@m.scnu.edu.cn", 1, new Department(105, "小卖部")));
    }

    //主键自增
    private static Integer initId = 1006;
    //增加一个员工
    public void add(Employee employee){
        if (employee.getId() == null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getEmployees(){
        return employees.values();
    }

    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    public void deleteEmployee(Integer id){
        employees.remove(id);
    }
}