package com.jwt.example.jwtproject.Controllers;

import com.jwt.example.jwtproject.Entity.User;
import com.jwt.example.jwtproject.Services.Userservice;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeControllers {

    @Autowired
    private Userservice userservice;

    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting User");
        return this.userservice.getUser();
    }



}
