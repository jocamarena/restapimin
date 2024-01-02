package com.example.restapimin.api;

import com.example.restapimin.model.records.GreetingRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/greeting")
public class Greeting {
    @GetMapping
    public ResponseEntity<GreetingRecord> getGreeting() {
        return ResponseEntity.ok(new GreetingRecord("2021-09-01", "Hello, World!"));
    }
    @GetMapping("/{name}")
    public ResponseEntity<GreetingRecord> getGreeting(@PathVariable String name) {
        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        LocalDate localDate = LocalDate.now();
        return ResponseEntity.ok(new GreetingRecord( localDate.toString(), "Hello, " + formattedName + "!"));
    }
}
