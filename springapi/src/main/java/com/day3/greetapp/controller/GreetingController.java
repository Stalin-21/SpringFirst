package com.day3.greetapp.controller;

import org.springframework.web.bind.annotation.*;
import com.day3.greetapp.dto.GreetingRequest;
import com.day3.greetapp.model.Greeting;
import com.day3.greetapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    @GetMapping("/greeting/name/{name}")
    public String greetingPath(@PathVariable String name) {
        return "Hello " + name;
    }

    // UC4: Save Greeting to DB
    @PostMapping("/greeting")
    public Greeting saveGreeting(@RequestBody GreetingRequest request) {
        return greetingService.saveGreeting(request.getMessage());
    }

    // UC5: Get Greeting by ID
    @GetMapping("/greeting/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }

    // UC6: Get all greetings
    @GetMapping("/greetings")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    // UC7: Update Greeting by ID
    @PutMapping("/greeting/{id}")
    public Greeting updateGreeting(
            @PathVariable Long id,
            @RequestBody GreetingRequest request) {

        return greetingService.updateGreeting(id, request.getMessage());
    }

}
