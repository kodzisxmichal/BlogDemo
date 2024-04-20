package com.example.blog.models.DTOs;

import lombok.Getter;

import java.util.Date;


@Getter
public class CommentDTO {

    private Long authorID;
    private String value;
    private Date createDate;
    private Long parentID;


    public void setParentID(Long parentID) {
        this.parentID = parentID;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setAuthorID(Long authorID) {
        this.authorID = authorID;
    }
}
