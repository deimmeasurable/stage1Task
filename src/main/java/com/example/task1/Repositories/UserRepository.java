package com.example.task1.Repositories;

import com.example.task1.model.User;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository


public interface UserRepository  extends MongoRepository<User,String> {
    User findUserByUserName(String userName);
}
