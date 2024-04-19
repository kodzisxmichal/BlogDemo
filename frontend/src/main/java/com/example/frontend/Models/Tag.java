package com.example.frontend.Models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;


@Getter
@RequiredArgsConstructor
public class Tag {

    private Long ID;
    private String name;
    private Set<Post> posts;

    public void setID(Long id) {
        this.ID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}
