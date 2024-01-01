package com.example.restapimin.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class Greeting {
    @GetMapping
    public ResponseEntity<String> getGreeting() {
        return ResponseEntity.ok("Hello World, my name is Jose Camarena");
    }
}
