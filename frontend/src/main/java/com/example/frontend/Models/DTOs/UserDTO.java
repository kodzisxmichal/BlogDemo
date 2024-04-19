package com.example.frontend.Models.DTOs;

import com.example.frontend.Models.Permission;
import lombok.Getter;

@Getter
public class UserDTO {

    private String username;
    private String password;
    private String email;
    private String avatarURL;

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
