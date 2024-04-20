package com.example.frontend.models.DTOs;

import lombok.Getter;

@Getter
public class TagDTO {

    private String name;
    private Long postID;

    public void setName(String name) {
        this.name = name;
    }

    public void setPostID(Long postID) {
        this.postID = postID;
    }
}
