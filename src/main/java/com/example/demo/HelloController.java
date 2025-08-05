package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Value("${myapp.greeting:Hello from default}")
    private String greeting;

    @GetMapping("/hello")
    public String hello() {
        return greeting;
    }
}
