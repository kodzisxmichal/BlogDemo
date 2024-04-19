package com.example.frontend.Models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;


@Getter
@RequiredArgsConstructor
public class Comment {
    private Long ID;
    private User author;
    private String value;
    private Date createDate;
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
