package com.example.realworld.modules.user.service;

import com.example.realworld.modules.user.response.ProfileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = false)
@Service
public class ProfileService {

    public ProfileResponse getProfileByUsername(String username) {
        return null;
    }
}
