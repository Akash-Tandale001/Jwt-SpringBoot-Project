package com.jwt.example.jwtproject.Services;

import com.jwt.example.jwtproject.Entity.User;
import com.jwt.example.jwtproject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class Userservice {
    @Autowired
    private UserRepository userRepository;


    public List<User> getUser(){
        return userRepository.findAll();
    }

    public User createUser(User user) {

         return userRepository.save(user);
    }
}
