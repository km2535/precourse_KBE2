package com.example.precourse.ch3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/b")
public class RestApiBController {

    @GetMapping("/hello")
    public void hello(){
        throw new NumberFormatException("넘버 포멧 이셉션");
    }

    // 먼저 해당 클래스 안에서 이셉션을 먼저 찾음!
//    @ExceptionHandler(value = {NumberFormatException.class})
//    public ResponseEntity numberFormatException(
//            NumberFormatException e
//    ){
//        log.error("RestApiBController", e);
//        return ResponseEntity.ok().build();
//    }
}
