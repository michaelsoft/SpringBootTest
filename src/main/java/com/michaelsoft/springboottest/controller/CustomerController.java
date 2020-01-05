package com.michaelsoft.springboottest.controller;

import com.michaelsoft.springboottest.entity.*;
import com.michaelsoft.springboottest.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    /**
     * 添加内容
     *
     * @param age
     */
    @PostMapping(value = "/customers")
    public void create(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customerRepository.save(customer);
    }


}
