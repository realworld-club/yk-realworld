package com.example.realworld.modules.user.repository;

import com.example.realworld.modules.user.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
