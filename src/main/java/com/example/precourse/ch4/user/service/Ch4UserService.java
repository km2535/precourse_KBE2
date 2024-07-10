package com.example.precourse.ch4.user.service;

import com.example.precourse.ch4.user.db.Ch4UserRepository;
import com.example.precourse.ch4.user.model.Ch4UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Ch4UserService {

    private final Ch4UserRepository userRepository;

    public Ch4UserEntity save(Ch4UserEntity user) {
      return userRepository.save(user);
    }

    public List<Ch4UserEntity> findAll(){
      return  userRepository.findAll();
    }

    public Optional<Ch4UserEntity> findById(Long id){
        return userRepository.findById(id);
    }
    public List<Ch4UserEntity> filterScore(int score){
        return userRepository.findAllScoreGreaterThen(score);
    }
    public void deleteById(Long id){
        userRepository.delete(id);
    }
}