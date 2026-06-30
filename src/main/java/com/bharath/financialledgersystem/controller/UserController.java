package com.bharath.financialledgersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bharath.financialledgersystem.dto.LoginRequest;
import com.bharath.financialledgersystem.dto.UserRequest;
import com.bharath.financialledgersystem.entity.User;
import com.bharath.financialledgersystem.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody UserRequest request) {
        return userService.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return userService.login(request);
    }
}