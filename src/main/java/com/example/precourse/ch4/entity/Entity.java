package com.example.precourse.ch4.entity;

import lombok.Data;

@Data
public abstract class Entity  implements PrimaryKey{
    private Long id;
}
