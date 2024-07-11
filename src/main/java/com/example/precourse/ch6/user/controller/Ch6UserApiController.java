package com.example.precourse.ch6.user.controller;

import com.example.precourse.ch6.user.db.UserEntity;
import com.example.precourse.ch6.user.db.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/user/ch6")
@RequiredArgsConstructor
public class Ch6UserApiController {

    private final UserRepository userRepository;

    @GetMapping("/find-all")
    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    @PostMapping("/save")
    public UserEntity autoSave(
            @RequestBody UserEntity userEntity
    ){
        userRepository.save(userEntity);
        return userEntity;
    }
}
