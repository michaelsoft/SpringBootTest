package com.michaelsoft.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World";
    }

    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String say(@PathVariable("name") String name){
        return "Hello " + name;
    }

    @Autowired
    private ConfigProperties configProperties;

    @RequestMapping(value = "/config",method = RequestMethod.GET)
    public String getConfig(){
        return configProperties.getSize();
        //return "michael test";
    }

}
