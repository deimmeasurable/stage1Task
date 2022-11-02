package com.example.task1.service;

import com.example.task1.Repositories.UserRepository;
import com.example.task1.Dto.UserRequest;
import com.example.task1.Dto.UserResponse;
import com.example.task1.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//@org.springframework.data.mongodb.repository.config.EnableMongoRepositories(basePackages = "com.example.task1.repositories")
@Service

@Component
public class UserServiceImpl implements UserService{





    @Override
    public User getDetails() {
        User    user    =   new User("elior",true,24,"I want to improve my backend skill");

        return user;
    }





}
