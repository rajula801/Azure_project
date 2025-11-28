package org.rajula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {


    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/api/greeting")
    public String getGreeting() {
        return "Greetings from your Spring Boot API Service!";
    }
}