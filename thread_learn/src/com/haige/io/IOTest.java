package com.haige.io;

import java.io.*;
import java.util.Properties;

/**
 * @className: com.haige.io-> IOTest
 * @description:
 * @author: cqh
 * @createDate: 2022-04-05 21:35
 * @version: 1.0
 * @todo:
 */
public class IOTest{

    public static void main(String[] args) throws IOException {

        String properties = System.getProperty("user.dir");
        System.out.println("当前路径 : " + properties );

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("aaa", 111, 20);
        employees[1] = new Employee("bbb", 222, 30);
        employees[2] = new Employee("ccc", 333, 40);

        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("test.txt"));
            for (Employee employee : employees) {
                writeData(output,employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeData(DataOutputStream out,Employee e) throws IOException {
        out.writeDouble(e.getSalary());

    }

    static class Employee{
        private String name;
        private Integer salary;
        private Integer age;

        public Employee(String name, Integer salary, Integer age) {
            this.name = name;
            this.salary = salary;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
