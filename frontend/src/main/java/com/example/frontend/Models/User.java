package com.example.frontend.Models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public class User {

    private Long ID;
    private String username;
    private String password;
    private String email;
    private String avatarURL;
    private Permission permission;


    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
