package com.example.realworld.modules.user.vo;

import com.example.realworld.modules.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Lob;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User extends BaseEntity {

    private String email;
    private String token;
    private String username;
    private String password;

    @Lob
    private String bio;
    private String image;

    @Builder
    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
