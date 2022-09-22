package com.example.SpringBoot.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(path="/")
    String hello() {
        return "Hello World, Spring Boot!";
    }

}
