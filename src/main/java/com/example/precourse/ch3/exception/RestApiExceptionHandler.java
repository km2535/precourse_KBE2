package com.example.precourse.ch3.exception;

import com.example.precourse.ch3.model.Api;
import com.example.precourse.ch3.model.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@Slf4j
@RestControllerAdvice(basePackages = "com.example.precourse.ch3.controller")
public class RestApiExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity exception(
            Exception e
    ){
        log.error("RestApiException : ", e);
        return ResponseEntity.status(200).build();
    }

        @ExceptionHandler(value = {IndexOutOfBoundsException.class})
        public ResponseEntity outOfBound(
                IndexOutOfBoundsException e
    ){
            log.error("outbound :", e);
            return ResponseEntity.status(200).build();
    }

    @ExceptionHandler(value = {NoSuchElementException.class})
    public ResponseEntity<Api<UserResponse>> noSuchElement(
            NoSuchElementException e
    ){
        log.error("",e);
        var response =  Api.<UserResponse>builder()
                .resultCode(String.valueOf(HttpStatus.NOT_FOUND.value()))
                .resultMessage(HttpStatus.NOT_FOUND.name())
                .build();

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
}
