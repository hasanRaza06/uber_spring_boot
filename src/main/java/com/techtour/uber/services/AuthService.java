package com.techtour.uber.services;

import com.techtour.uber.dto.DriverDTO;
import com.techtour.uber.dto.SignupDTO;
import com.techtour.uber.dto.UserDTO;

public interface AuthService {
    String login(String email,String password);
    UserDTO signup(SignupDTO signupDTO);

    DriverDTO onBoardNewDriver(Long userId);
}
