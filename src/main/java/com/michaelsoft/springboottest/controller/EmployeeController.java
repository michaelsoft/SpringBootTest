package com.michaelsoft.springboottest.controller;

import com.michaelsoft.springboottest.ConfigProperties;
import com.michaelsoft.springboottest.entity.Employee;
import com.michaelsoft.springboottest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/employee/{name}",method = RequestMethod.GET)
    public String say(@PathVariable("name") String name){
        return "This is " + name;
    }

    /**
     * 查询所有
     * @return
     */
    @GetMapping(value = "/employees")
    public List<Employee> employeeList() {
        return employeeRepository.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GetMapping(value = "/employeeById/{id}")
    public Employee employeeFindOne(@PathVariable("id") Integer id) {
        Optional<Employee> temp = employeeRepository.findById(id);
        //从返回值中获取值
        return temp.get();
    }

    /**
     * 添加内容
     * @param age
     */
    @PostMapping(value = "/employees")
    public Employee employeeAdd(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmployeeAge(age);
        employee.setEmployeeName(name);
        return employeeRepository.save(employee);
    }

    /**
     * 更新
     */
    @PutMapping(value = "/moEmployeeById/{id}")
    public Employee employeeUpdate(@PathVariable("id") Integer id, @RequestParam("age") Integer age,@RequestParam("name") String name) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setEmployeeAge(age);
        employee.setEmployeeName(name);
        return employeeRepository.save(employee);
    }

    /**
     * 删除
     */
    @DeleteMapping(value = "/delEmployees/{id}")
    public void employeeDelete(@PathVariable("id") Integer id) {
        Employee employee = new Employee();
        employee.setId(id);
        employeeRepository.delete(employee);
    }

}
