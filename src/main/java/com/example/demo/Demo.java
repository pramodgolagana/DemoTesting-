package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("/hello")
    String sayHello(){
        return "Hello this is my first programming ";
    }

    @RequestMapping("/hello/{nameOfPerson}")
    String sayHello(@PathVariable("nameOfPerson")  String name){
        return "Hello this is my your first API  "+name;
    }

}
