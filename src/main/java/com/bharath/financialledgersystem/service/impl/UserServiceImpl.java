package com.bharath.financialledgersystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.financialledgersystem.dto.LoginRequest;
import com.bharath.financialledgersystem.dto.UserRequest;
import com.bharath.financialledgersystem.entity.User;
import com.bharath.financialledgersystem.repository.UserRepository;
import com.bharath.financialledgersystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User register(UserRequest request) {

        User user = new User();

        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        return userRepository.save(user);
    }

    @Override
    public String login(LoginRequest request) {
        return "Login Successful";
    }
}