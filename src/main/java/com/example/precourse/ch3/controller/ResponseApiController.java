package com.example.precourse.ch3.controller;

import com.example.precourse.ch3.model.UserBasicInformation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ResponseApiController {
    @GetMapping("")
    public ResponseEntity<UserBasicInformation> user(){
        UserBasicInformation user = new UserBasicInformation();
        user.setUserName("이강민");
        user.setUserPhoneNumber("010-2020-3030");
        user.setUserEmail("lkm123");
        user.setIsKorean(true);

        ResponseEntity<UserBasicInformation> response = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);

        log.info("User : {}", user);
        return response;
    }
}
