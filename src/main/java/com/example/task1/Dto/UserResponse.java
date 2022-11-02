package com.example.task1.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private String userName;
    private boolean backend;
    private int age;
    private String bio;
}

