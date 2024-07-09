package com.example.precourse.ch2.controller;

import com.example.precourse.ch2.model.BookRequest;
import com.example.precourse.ch2.model.UserBasicInformation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public String post(
            @RequestBody  BookRequest bookRequest
    ){
        System.out.println(bookRequest);
        return bookRequest.toString();
    }

    @PostMapping("/user")
    public String postUserBasicInformation(
            @RequestBody UserBasicInformation userBasicInformation
    ){
        System.out.println(userBasicInformation);
        return userBasicInformation.toString();
    }
}
