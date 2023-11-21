package com.example.devopspipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/home")
    public String mainMenu(){
        return "Welcome to Spring Boot application v1";
    }
}
