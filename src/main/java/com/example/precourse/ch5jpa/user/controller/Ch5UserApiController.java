package com.example.precourse.ch5jpa.user.controller;

import com.example.precourse.ch5jpa.user.model.Ch5UserEntity;
import com.example.precourse.ch5jpa.user.service.Ch5UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/ch5")
@RequiredArgsConstructor
public class Ch5UserApiController {

    private final Ch5UserService userService;

    @PutMapping("")
    public Ch5UserEntity create(
            @RequestBody Ch5UserEntity userEntity
    ){
        return userService.save(userEntity);
    }

    @GetMapping("/all")
    public List<Ch5UserEntity> findAll(){
        return userService.findAll();
    }

    // delete
    @DeleteMapping("/id/{id}")
    public void delete(
            @PathVariable Long id
    ){
        userService.deleteById(id);
    }


    // findby id -> path variable
    @GetMapping("/id/{id}")
    public Ch5UserEntity findOne(
            @PathVariable Long id
    ){
        var response = userService.findById(id);
        return response.get();
    }

    @GetMapping("/score")
    public List<Ch5UserEntity> filterScore(
            @RequestParam int score
    ){
        return userService.filterScore(score);
    }

    @GetMapping("/min_max")
    public List<Ch5UserEntity> filterScore(
            @RequestParam int min, @RequestParam int max
    ){
        return userService.filterScore(min, max);
    }
}
