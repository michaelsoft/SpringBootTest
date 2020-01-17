package com.michaelsoft.springboottest.service;

import com.michaelsoft.springboottest.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    void createEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    Optional<Employee> getEmployee(Integer id);

    List<Employee> getEmployees();
}
