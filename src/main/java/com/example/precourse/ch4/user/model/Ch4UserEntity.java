package com.example.precourse.ch4.user.model;

import com.example.precourse.ch4.entity.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ch4UserEntity extends Entity {
    private String name;
    private int score;
}
