package com.example.realworld.modules.user.response;

import com.example.realworld.modules.user.vo.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponse {

    public UserResponse(User user) {

    }

    public static UserResponse of(User user) {
        return new UserResponse(user);
    }
}
