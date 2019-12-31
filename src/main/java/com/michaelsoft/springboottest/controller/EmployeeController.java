package com.michaelsoft.springboottest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @RequestMapping(value = "/employee/{name}",method = RequestMethod.GET)
    public String say(@PathVariable("name") String name){
        return "This is " + name;
    }
}
