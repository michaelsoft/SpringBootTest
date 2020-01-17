package com.michaelsoft.springboottest.controller;

import com.michaelsoft.springboottest.entity.Employee;
import com.michaelsoft.springboottest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
    @RequestMapping(value = "/employee/{name}",method = RequestMethod.GET)
    public String say(@PathVariable("name") String name){
        return "This is " + name;
    }


    /**
     * 添加内容
     * @param age
     */
    @PostMapping(value = "/employees")
    public void employeeAdd(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        Employee employee = new Employee();
        employee.setEmployeeAge(age);
        employee.setEmployeeName(name);
        employeeService.createEmployee(employee);
    }



}
