package com.day3.greetapp.service;

import com.day3.greetapp.model.Greeting;
import com.day3.greetapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting saveGreeting(String message) {
        return greetingRepository.save(new Greeting(message));
    }
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found with id: " + id));
    }

    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    public Greeting updateGreeting(Long id, String message) {
        Greeting greeting = greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found with id: " + id));

        greeting.setMessage(message);
        return greetingRepository.save(greeting);
    }

    public void deleteGreetingById(Long id) {
        if (!greetingRepository.existsById(id)) {
            throw new RuntimeException("Greeting not found with id: " + id);
        }
        greetingRepository.deleteById(id);
    }

}
