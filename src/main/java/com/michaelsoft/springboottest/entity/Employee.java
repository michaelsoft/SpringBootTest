package com.michaelsoft.springboottest.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "employeeAge")
    private Integer employeeAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer value) {
        id = value;
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

