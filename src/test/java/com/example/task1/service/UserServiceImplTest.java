package com.example.task1.service;
import com.example.task1.Dto.UserRequest;
import com.example.task1.Dto.UserResponse;
import com.example.task1.Repositories.UserRepository;
import com.example.task1.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


//@DataMongoTest
//@ExtendWith(SpringExtension.class)
//@ActiveProfiles("test")
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@SpringBootTest

public class UserServiceImplTest {
   @Autowired
    private UserService userService;




    @BeforeEach
    void setUp() {
        userService=new UserServiceImpl();

    }



    @Test
    public void testThatAUserCanBeCreateUser(){
        UserRequest userRequest = UserRequest.builder()
                .userName("elior")
                .age(33)
                .bio("I want to improve my backend skill ")
                .backend(true)

                .build();

        UserResponse userResponse=userService.createUserDetails(userRequest);

        assertEquals(userResponse.getUserName(),"elior");
        assertEquals(userResponse.getBio(),"I am black in complexion");

    }
    @Test
    public void testThatAUserCanBeFindById(){
        UserRequest userRequest = UserRequest.builder()
                .userName("elior")
                .age(24)
                .bio("I am black in complexion")
                .backend(true)

                .build();
        userService.createUserDetails(userRequest);
        User user = userService.getAUserByUsername(userRequest.getUserName());
    }
  
}