package com.example.frontend.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Getter
@RequiredArgsConstructor
public class Category {

    private Long ID;
    private String name;
    private Set<Post> posts;


    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public String getName() {
        return name;
    }

    public Long getID() {
        return ID;
    }
}
