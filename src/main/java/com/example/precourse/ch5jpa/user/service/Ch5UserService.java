package com.example.precourse.ch5jpa.user.service;

import com.example.precourse.ch5jpa.user.db.Ch5UserRepository;
import com.example.precourse.ch5jpa.user.model.Ch5UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Ch5UserService {
     private final Ch5UserRepository userRepository;

    public Ch5UserEntity save(Ch5UserEntity user){
        // save
        return userRepository.save(user);
    }

    public List<Ch5UserEntity> findAll(){
        return userRepository.findAll();
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    public Optional<Ch5UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public List<Ch5UserEntity> filterScore(int score){
        return userRepository.findAllByScoreGreaterThanEqual(score);
    }

    public List<Ch5UserEntity> filterScore(int min, int max){
        return userRepository.findAllByScoreGreaterThanEqualAndScoreLessThanEqual(min, max);
    }
}
