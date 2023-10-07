package com.javaguides.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// controller + responseBody
@RestController
public class HelloWorldController {

    // http get request
    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String helloWorld() {

        return "hello!!!";
    }
}
