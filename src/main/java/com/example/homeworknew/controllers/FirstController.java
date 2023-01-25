package com.example.homeworknew.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
    @GetMapping
    public String helloWorld(){
        return "Все работает";
    }
}
