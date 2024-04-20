package com.example.blog.models.DTOs;

import lombok.Getter;

@Getter
public class PostDTO {

    private String title;
    private String description;
    private String content;
    private Long authorID;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthorID(Long authorID) {
        this.authorID = authorID;
    }
//    private Set<Category> categories;
//    private Set<Tag> tags;
}
