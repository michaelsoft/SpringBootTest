package com.michaelsoft.springboottest.entity;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;

    private String employeeName;

    private Integer employeeAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public  String getEmployeeName()
    {
        return employeeName;
    }

    public  void setEmployeeName(String value)
    {
        employeeName = value;
    }

    public  Integer getEmployeeAge()
    {
        return employeeAge;
    }

    public  void setEmployeeAge(Integer value)
    {
        employeeAge = value;
    }
}

