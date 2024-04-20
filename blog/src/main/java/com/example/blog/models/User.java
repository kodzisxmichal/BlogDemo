package com.example.blog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
@Entity
public class User {
    @Id
    private Long ID;
    private String username;
    private String password;
    private String email;
    private String avatarURL;
    @ManyToOne
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
