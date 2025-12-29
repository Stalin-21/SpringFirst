package com.day3.greetapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.day3.greetapp.dto.GreetingRequest;
import com.day3.greetapp.model.Greeting;
import com.day3.greetapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

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

    // UC4: Save Greeting to DB
    @PostMapping("/greeting")
    public Greeting saveGreeting(@RequestBody GreetingRequest request) {
        return greetingService.saveGreeting(request.getMessage());
    }

}
