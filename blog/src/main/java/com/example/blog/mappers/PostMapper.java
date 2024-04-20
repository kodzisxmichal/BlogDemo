package com.example.blog.mappers;

import com.example.blog.models.Post;
import com.example.blog.models.DTOs.PostDTO;
import com.example.blog.services.ServicesCatalog;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@RequiredArgsConstructor
@Component
public class PostMapper implements IMap<PostDTO, Post>{

    private final ServicesCatalog servicesCatalog;

    @Override
    public Post map(PostDTO dto) {
        Post post = new Post();

        post.setTitle(dto.getTitle());
        post.setContent(dto.getContent());
        post.setDescription(dto.getDescription());
        post.setCreateDate(new Timestamp(new Date().getTime()));
        post.setAuthor(servicesCatalog.getUserService().findById(dto.getAuthorID()));

        return post;
    }
}
