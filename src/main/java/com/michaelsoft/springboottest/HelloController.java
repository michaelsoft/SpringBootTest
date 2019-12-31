package com.michaelsoft.springboottest;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String say(@PathVariable("name") String name){
        return "Hello: " + name;
    }
}
