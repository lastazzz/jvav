package com.lasta.jvav.controller;


import com.lasta.jvav.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @GetMapping("/get")
    public User getUser() {
        return User.builder()
                .username("user")
                .password("password").build();
    }

    @PostMapping("/add")
    public String addUser(User user) {
        return "ok";
    }
}
