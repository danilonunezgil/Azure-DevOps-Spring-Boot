package com.example.devopspipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String mainMenu(){
        return "Welcome to spring boot application v1.0";
    }
}
