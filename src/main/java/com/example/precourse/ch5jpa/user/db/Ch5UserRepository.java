package com.example.precourse.ch5jpa.user.db;

import com.example.precourse.ch5jpa.user.model.Ch5UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Ch5UserRepository extends JpaRepository<Ch5UserEntity, Long> {

    public List<Ch5UserEntity> findAllByScoreGreaterThanEqual(int score);

    //select * from book_score_user where score>= ?? AND score <= ??
    public List<Ch5UserEntity> findAllByScoreGreaterThanEqualAndScoreLessThanEqual(int min, int max);
}
