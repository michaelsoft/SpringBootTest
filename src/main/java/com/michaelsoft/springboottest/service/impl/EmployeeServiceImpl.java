package com.michaelsoft.springboottest.service.impl;

import com.michaelsoft.springboottest.entity.Employee;
import com.michaelsoft.springboottest.repository.EmployeeRepository;
import com.michaelsoft.springboottest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
