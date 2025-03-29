package com.cricket.ipl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class IPLController {

    @GetMapping("greet")
    public String greet(){
        return "Welcome to IPL 2025";
    }
}
