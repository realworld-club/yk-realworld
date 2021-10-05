package com.example.realworld.modules.user.controller.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdateUserRequest {

    @Email
    @NotBlank
    private String email;

//    @NotBlank
//    private String username;

    @NotBlank
    private String password;

    // @NotBlank
    private String image;

    @NotBlank
    private String bio;

}
