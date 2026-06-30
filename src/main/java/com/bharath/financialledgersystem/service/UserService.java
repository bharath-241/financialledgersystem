package com.bharath.financialledgersystem.service;

import com.bharath.financialledgersystem.dto.LoginRequest;
import com.bharath.financialledgersystem.dto.UserRequest;
import com.bharath.financialledgersystem.entity.User;

public interface UserService {

    User register(UserRequest request);

    String login(LoginRequest request);

}