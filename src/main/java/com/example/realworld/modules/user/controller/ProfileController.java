package com.example.realworld.modules.user.controller;

import com.example.realworld.modules.user.response.ProfileResponse;
import com.example.realworld.modules.user.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/profiles/{username}")
    public ResponseEntity<?> getProfile(@PathVariable(name = "username") String username) {
        ProfileResponse profileResponse = profileService.getProfileByUsername(username);
        return ResponseEntity.ok(profileResponse);
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
