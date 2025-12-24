package com.springapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    private static final Logger logger =
            LoggerFactory.getLogger(HelloRestController.class);

    @GetMapping("/hello")
    public String helloRest() {

        logger.info("/api/hello endpoint called");

        return "Hello from BridgeLabz";
    }
}