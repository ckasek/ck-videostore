package com.ck4.videostore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private final static Logger log = LoggerFactory.getLogger(MovieController.class);

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "helloWorld";
    }
}