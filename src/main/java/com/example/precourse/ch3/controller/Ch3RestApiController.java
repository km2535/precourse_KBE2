package com.example.precourse.ch3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Ch3RestApiController {

    @GetMapping(path = "/exception")
    public void hello(){
        List<String> str = new ArrayList<>();
        str.add("dddd");
        String result = str.get(1);
    }
}
