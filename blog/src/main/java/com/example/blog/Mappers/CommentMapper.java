package com.example.blog.Mappers;

import com.example.blog.Models.Comment;
import com.example.blog.Models.DTOs.CommentDTO;
import com.example.blog.Services.CommentService;
import com.example.blog.Services.ICatalogServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.sql.Timestamp;
import java.util.Date;

@RequiredArgsConstructor
@Component
public class CommentMapper implements IMap<CommentDTO, Comment>{

    private final ICatalogServices services;


    @Override
    public Comment map(CommentDTO dto) {
        Comment comment = new Comment();

        comment.setAuthor(services.getUserService().findById(dto.getAuthorID()));
        comment.setValue(dto.getValue());
        comment.setCreateDate(new Timestamp(new Date().getTime()));
        comment.setParent(services.getPostService().findById(dto.getParentID()));

        return comment;
    }
}
