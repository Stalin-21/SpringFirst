package com.springapi.assignment2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/hello-rest")
public class HelloMessagingController {

    // UC1: Simple Hello
    @GetMapping
    public String hello() {
        return "Hello from BridgeLabz";
    }

    // UC2: Query Parameter
    @GetMapping("/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3: Path Variable
    @GetMapping("/param/{name}")
    public String helloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
