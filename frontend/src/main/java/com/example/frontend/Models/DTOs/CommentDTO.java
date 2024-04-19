package com.example.frontend.Models.DTOs;

import com.example.frontend.Models.Post;
import com.example.frontend.Models.User;
import lombok.Getter;

import java.util.Date;

@Getter
public class CommentDTO {

    private User author;
    private String value;
    private Date createDate;
    private Post parent;

    public void setAuthor(User author) {
        this.author = author;
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
