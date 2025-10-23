package com.jdev.hotelsystemapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel-system/api/v1/test")
public class Test {

    @GetMapping("/check")
    public String test() {
        return "Connected!.";
    }
}
