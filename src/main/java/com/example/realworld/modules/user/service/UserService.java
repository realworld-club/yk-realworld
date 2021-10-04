package com.example.realworld.modules.user.service;

import com.example.realworld.modules.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = false)
@Service
public class UserService {

    private final UserRepository userRepository;
}
