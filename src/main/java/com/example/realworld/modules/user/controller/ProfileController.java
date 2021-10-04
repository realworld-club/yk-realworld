package com.example.realworld.modules.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class ProfileController {

    @GetMapping("/profiles/{username}")
    public ResponseEntity<?> getProfile() {
        return null;
    }

    @PostMapping("/profiles/{username}/follow")
    public ResponseEntity<?> followUser() {
        return null;
    }

    @DeleteMapping("/profiles/{username}/follow")
    public ResponseEntity<?> unfollowUser() {
        return null;
    }
}
