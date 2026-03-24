package com.rayan.tp_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Félicitations Rayan ! Ton application Spring Boot tourne dans Docker !";
    }
}