package com.example.realworld.modules.user.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    public Profile(User user) {
        this.username = user.getUsername();
        this.bio = user.getBio();
        this.image = user.getImage();
    }

    private String username;
    private String bio;
    private String image;
    private boolean following = false;
}
