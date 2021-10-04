package com.example.realworld.modules.user.controller;

import com.example.realworld.modules.user.controller.request.LoginRequest;
import com.example.realworld.modules.user.controller.request.UserCreateRequest;
import com.example.realworld.modules.user.service.LoginService;
import com.example.realworld.modules.user.service.UserService;
import com.example.realworld.modules.user.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final LoginService loginService;
    private final UserService userService;

    @PostMapping("/users/login")
    public ResponseEntity<?> authentication(@RequestBody @Valid LoginRequest loginRequest) {
        User user = loginService.login(loginRequest);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<?> registration(@RequestBody @Valid UserCreateRequest userCreateRequest) {
        User user = loginService.signUp(userCreateRequest);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    // Get Current User
    @GetMapping("/user")
    public ResponseEntity<?> getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return null;
    }

    @PutMapping("/user")
    public ResponseEntity<?> updateUser() {
        // Authentication

        return null;
    }
}
