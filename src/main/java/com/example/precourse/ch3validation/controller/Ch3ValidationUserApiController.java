package com.example.precourse.ch3validation.controller;

import com.example.precourse.ch3validation.model.Ch3Api;
import com.example.precourse.ch3validation.model.Ch3ValidationUserRegisterRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class Ch3ValidationUserApiController {

    @PostMapping("/validation")
    public Ch3Api<Ch3ValidationUserRegisterRequest> register(
        @Valid
        @RequestBody Ch3Api<Ch3ValidationUserRegisterRequest> ch3ValidationUserRegisterRequest
    ){
        log.info("init : {}", ch3ValidationUserRegisterRequest);

        var body = ch3ValidationUserRegisterRequest.getData();

        Ch3Api<Ch3ValidationUserRegisterRequest> response =
                Ch3Api.<Ch3ValidationUserRegisterRequest>builder()
                        .resultCode(String.valueOf(HttpStatus.OK.value()))
                        .resultMessage(HttpStatus.OK.getReasonPhrase())
                        .data(body)
                        .build();

        return response;
    }

}
