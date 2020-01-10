package com.zh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/test")
    public String test() {
        return "{\"success\":true}";
    }

}
