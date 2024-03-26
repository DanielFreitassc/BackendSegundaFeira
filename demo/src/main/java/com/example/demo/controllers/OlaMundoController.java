package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ola")
public class OlaMundoController {

    @GetMapping
    public String ola() {
        return "Olá mundo";
    }
     
}
