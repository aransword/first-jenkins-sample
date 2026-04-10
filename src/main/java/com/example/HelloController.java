package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Jenkins CI/CD!";
    }

    @GetMapping("/test")
    public String jenkinsTest() {
        return "Test Success1";
    }

    @GetMapping("/asdf")
    public String jenkTest() {
        return "Test0";
    }
}
