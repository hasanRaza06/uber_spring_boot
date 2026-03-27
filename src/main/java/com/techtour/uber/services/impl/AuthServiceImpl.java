package com.techtour.uber.services.impl;

import com.techtour.uber.dto.DriverDTO;
import com.techtour.uber.dto.SignupDTO;
import com.techtour.uber.dto.UserDTO;
import com.techtour.uber.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignupDTO signupDTO) {
        return null;
    }

    @Override
    public DriverDTO onBoardNewDriver(Long userId) {
        return null;
    }
}
