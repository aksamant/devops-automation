package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/messages")
    public String getMessage () {
        return "Welcome to Sample Docker project-000";
    }
}
