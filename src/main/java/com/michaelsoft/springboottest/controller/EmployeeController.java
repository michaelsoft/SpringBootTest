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

    @RequestMapping(value = "/employee/{name}",method = RequestMethod.GET)
    public String say(@PathVariable("name") String name){
        return "This is " + name;
    }

    /**
     * 添加内容
     * @param age
     */
    @PostMapping(value = "/employees")
    public int employeeAdd(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        Employee employee = new Employee();
        employee.setEmployeeAge(age);
        employee.setEmployeeName(name);
        employeeService.createEmployee(employee);
        return  0;
    }

    @PutMapping(value = "/employees")
    public int updateEmployee(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setEmployeeAge(age);
        employee.setEmployeeName(name);
        employeeService.createEmployee(employee);
        return  0;
    }

    @DeleteMapping(value = "/employees")
    public void deleteEmployee(@RequestParam("id") Integer id) {
        Employee employee = new Employee();
        employee.setId(id);
        employeeService.deleteEmployee(employee);
    }

    @GetMapping(value = "/employees")
    public Optional<Employee> getEmployee(@RequestParam("id") Integer id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping(value = "/employees/all")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
