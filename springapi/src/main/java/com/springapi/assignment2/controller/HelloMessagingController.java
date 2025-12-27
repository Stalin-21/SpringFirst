package com.springapi.assignment2.controller;

import org.springframework.web.bind.annotation.*;
import com.springapi.assignment2.model.User;

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

    // UC4: POST with Request Body
    @PostMapping("/post")
    public String helloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " "
                + user.getLastName() + " from BridgeLabz";
    }

    // UC5: PUT with Path Variable + Query Parameter
    @PutMapping("/put/{firstName}")
    public String helloPut(
            @PathVariable String firstName,
            @RequestParam String lastName) {

        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}
