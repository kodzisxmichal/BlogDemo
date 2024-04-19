package com.example.blog.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.Set;

@Getter
@RequiredArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String title;
    private String description;
    private String content;
    private Date createDate;
    @OneToOne
    private User author;
    @ManyToMany
    private Set<Category> categories;//
    @ManyToMany
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
