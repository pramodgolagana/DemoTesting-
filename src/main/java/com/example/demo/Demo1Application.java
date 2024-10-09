package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        Test t = new Test(10);
        System.out.println("Hello");
        SpringApplication.run(Demo1Application.class, args);
    }

}
