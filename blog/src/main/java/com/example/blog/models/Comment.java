package com.example.blog.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;


@Getter
@RequiredArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @ManyToOne
    private User author;
    private String value;
    private Date createDate;
    @ManyToOne
    private Post parent;

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }

}
