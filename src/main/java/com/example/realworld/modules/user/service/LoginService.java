package com.example.realworld.modules.user.service;

import com.example.realworld.modules.user.controller.request.LoginUserRequest;
import com.example.realworld.modules.user.controller.request.NewUserRequest;
import com.example.realworld.modules.user.repository.UserRepository;
import com.example.realworld.modules.user.response.UserResponse;
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
    public UserResponse login(LoginUserRequest loginUserRequest) {
        return null;
    }

    public UserResponse createUser(NewUserRequest newUserRequest) {

        User user = User.builder()
                .email(newUserRequest.getEmail())
                .username(newUserRequest.getUsername())
                // TODO - BCryptPasswordEncoder / security 추가
                .password(newUserRequest.getPassword())
                .build();
        return UserResponse.of(userRepository.save(user));
    }
}
