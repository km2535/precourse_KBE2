package com.example.precourse.ch4.user.controller;

import com.example.precourse.ch4.user.model.Ch4UserEntity;
import com.example.precourse.ch4.user.service.Ch4UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class Ch4UserApiController {

    private final Ch4UserService userService;
    @PutMapping("/create")
    public Ch4UserEntity create(
            @RequestBody Ch4UserEntity userEntity
    ){
        return userService.save(userEntity);
    }

    @GetMapping("/all")
    public List<Ch4UserEntity> findAll(){
        return userService.findAll();
    }

    //delete
    @DeleteMapping("/delete")
    public void deleteData(
            @RequestParam Long id
    ){
        userService.deleteById(id);
    }

    //findById
    @GetMapping("/id")
    public Optional<Ch4UserEntity> findById(
            @RequestParam Long id
    ){
        return userService.findById(id);
    }

    @GetMapping("/score")
    public List<Ch4UserEntity> filterScore(
            @RequestParam int score
    ){
        return userService.filterScore(score);
    }

}
