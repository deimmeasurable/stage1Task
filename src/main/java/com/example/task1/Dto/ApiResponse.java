package com.example.task1.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class ApiResponse {
    private String message;
    private boolean isSuccessful;

    public ApiResponse(String message,boolean isSuccessful) {
        this.message = message;
        this.isSuccessful = isSuccessful;
    }

    public ApiResponse(boolean b, Exception ex) {

    }
}

