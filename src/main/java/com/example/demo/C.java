package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
