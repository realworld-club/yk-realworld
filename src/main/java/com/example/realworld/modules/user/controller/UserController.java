package com.example.realworld.modules.user.controller;

import com.example.realworld.modules.user.controller.request.LoginUserRequest;
import com.example.realworld.modules.user.controller.request.NewUserRequest;
import com.example.realworld.modules.user.controller.request.UpdateUserRequest;
import com.example.realworld.modules.user.response.ProfileResponse;
import com.example.realworld.modules.user.response.UserResponse;
import com.example.realworld.modules.user.service.LoginService;
import com.example.realworld.modules.user.service.UserService;
import com.example.realworld.modules.user.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final LoginService loginService;
    private final UserService userService;

    @PostMapping("/users/login")
    public ResponseEntity<?> authentication(@RequestBody @Valid LoginUserRequest loginUserRequest) {
        UserResponse userResponse = loginService.login(loginUserRequest);
        return ResponseEntity.ok(userResponse);
    }

    @PostMapping("/users")
    public ResponseEntity<?> registration(@RequestBody @Valid NewUserRequest newUserRequest) {
        UserResponse userResponse = loginService.createUser(newUserRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }

    // https://ncucu.me/137 - Adapter 클래스 생성
    @GetMapping("/user")
    public ResponseEntity<?> getCurrentUser(@AuthenticationPrincipal User user) {
        // getCurrentUser
        return ResponseEntity.ok(UserResponse.of(user));
    }

    @PutMapping("/user")
    public ResponseEntity<?> updateUser(@AuthenticationPrincipal User user,
            @RequestBody @Valid UpdateUserRequest updateUserRequest) {
        // updateCurrentUser
        return ResponseEntity.ok(UserResponse.of(user));
    }
}
