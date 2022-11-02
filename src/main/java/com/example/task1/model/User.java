package com.example.task1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Data
@AllArgsConstructor

@Builder
@Document
public class User {

    private String userName;
    private boolean backend;
    private int age;
    private String bio;



}
