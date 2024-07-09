package com.example.precourse.ch2.controller;

import com.example.precourse.ch2.model.UserBasicInformation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody UserBasicInformation userBasicInformation) {
      log.info("Request : {}", userBasicInformation);
    }
}
