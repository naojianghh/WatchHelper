package com.azu.watchHelper02.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Movie {
    private Integer id;
    private String name;
    private LocalDateTime releaseTime;
    private String location;
}
