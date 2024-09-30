package com.colak.springtutorial.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
@Slf4j
public class HelloController {

    // http://localhost:8080/api/hello
    @GetMapping
    String hello() {
        log.info("logging a log from {}", HelloController.class.getSimpleName());
        return "Hello";
    }
}
