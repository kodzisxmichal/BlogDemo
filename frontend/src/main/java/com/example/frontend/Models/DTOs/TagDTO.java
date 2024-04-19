package com.example.frontend.Models.DTOs;

import com.example.frontend.Models.Post;
import lombok.Getter;

import java.util.Set;

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
