package com.example.frontend.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.Set;

@Getter
@RequiredArgsConstructor
public class Post {

    private Long ID;
    private String title;
    private String description;
    private String content;
    private Date createDate;
    private User author;
    private Set<Category> categories;
    private Set<Tag> tags;

    public void setID(Long id) {
        this.ID = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

}
