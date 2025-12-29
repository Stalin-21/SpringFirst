package com.day3.greetapp.service;

import com.day3.greetapp.model.Greeting;
import com.day3.greetapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting createGreeting(String message) {
        return greetingRepository.save(new Greeting(message));
    }
}
