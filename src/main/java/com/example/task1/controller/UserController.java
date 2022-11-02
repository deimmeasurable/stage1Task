package com.example.task1.controller;

import com.example.task1.Dto.ApiResponse;
import com.example.task1.Dto.UserRequest;
import com.example.task1.model.User;
import com.example.task1.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/User")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/details")
    public User getDetails(){
        return userService.getDetails();
    }
}
