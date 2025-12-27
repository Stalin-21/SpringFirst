package com.springapi.assignment2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-rest")
public class HelloMessagingController {

    // UC1: Simple Hello
    @GetMapping
    public String hello() {
        return "Hello from BridgeLabz";
    }
}
