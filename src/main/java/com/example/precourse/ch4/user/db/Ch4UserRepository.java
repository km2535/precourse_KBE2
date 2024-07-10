package com.example.precourse.ch4.user.db;

import com.example.precourse.ch4.db.SimpleDataRepository;
import com.example.precourse.ch4.user.model.Ch4UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Ch4UserRepository extends SimpleDataRepository<Ch4UserEntity, Long> {
    public List<Ch4UserEntity> findAllScoreGreaterThen(int score){
        return this.findAll().stream()
                .filter(it ->{
                    return it.getScore() >= score;
                })
                .collect(Collectors.toList());
    }
}
