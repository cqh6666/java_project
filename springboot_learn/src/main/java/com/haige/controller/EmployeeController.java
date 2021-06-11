package com.haige.controller;

import com.haige.dao.EmployeeDao;
import com.haige.pojo.Employee;
import com.haige.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/**
 * @className: com.haige.controller-> EmployeeController
 * @description:
 * @author: cqh
 * @createDate: 2021-06-09 20:32
 * @version: 1.0
 * @todo:
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getEmployees();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return "emp/add";
    }

    @RequestMapping("/delemp")
    public String deleteEmp(@RequestParam("id") Integer id){
        employeeDao.deleteEmployee(id);
        return "redirect:/emps";
    }
}
