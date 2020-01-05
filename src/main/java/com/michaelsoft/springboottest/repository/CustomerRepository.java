package com.michaelsoft.springboottest.repository;

import com.michaelsoft.springboottest.entity.Customer;
import com.michaelsoft.springboottest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}