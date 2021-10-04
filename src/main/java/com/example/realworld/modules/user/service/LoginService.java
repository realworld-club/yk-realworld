package com.example.realworld.modules.user.service;

import com.example.realworld.modules.user.controller.request.LoginRequest;
import com.example.realworld.modules.user.controller.request.UserCreateRequest;
import com.example.realworld.modules.user.repository.UserRepository;
import com.example.realworld.modules.user.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = false)
@Service
public class LoginService {

    private final UserRepository userRepository;
    // private final BCryptPasswordEncoder bCryptPasswordEncoder;

    // TODO
    public User login(LoginRequest loginRequest) {
        return null;
    }

    public User signUp(UserCreateRequest userCreateRequest) {

        User user = User.builder()
                .email(userCreateRequest.getEmail())
                .username(userCreateRequest.getUsername())
                // TODO - BCryptPasswordEncoder / security 추가
                .password(userCreateRequest.getPassword())
                .build();
        return userRepository.save(user);
    }
}
