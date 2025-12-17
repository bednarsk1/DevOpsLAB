package com.example.rest_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String home() {
        return "IT WORKS";
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello World";
    }
}