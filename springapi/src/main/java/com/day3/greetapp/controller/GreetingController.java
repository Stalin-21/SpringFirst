package com.day3.greetapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {

    // UC1
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello World";
    }

    // UC2-A: Query Parameters
    @GetMapping("/greeting/query")
    public String greetingQuery(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello " + firstName;
        } else if (lastName != null) {
            return "Hello " + lastName;
        }
        return "Hello World";
    }

    // UC2-B: Path Variable
    @GetMapping("/greeting/{name}")
    public String greetingPath(@PathVariable String name) {
        return "Hello " + name;
    }
}
