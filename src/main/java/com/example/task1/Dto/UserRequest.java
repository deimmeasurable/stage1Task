package com.example.task1.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserRequest {
    private Long id;
    private String userName;
    private boolean backend;
    private int age;
    private String bio;
}
