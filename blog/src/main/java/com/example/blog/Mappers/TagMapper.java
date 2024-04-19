package com.example.blog.Mappers;

import com.example.blog.Models.DTOs.TagDTO;
import com.example.blog.Models.Post;
import com.example.blog.Models.Tag;
import com.example.blog.Services.PostService;
import com.example.blog.Services.ServicesCatalog;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class TagMapper implements IMap<TagDTO, Tag>{

    private final ServicesCatalog servicesCatalog;

    @Override
    public Tag map(TagDTO dto) {
        Tag tag = new Tag();

        tag.setName(dto.getName());

        List<Post> posts = new ArrayList<>();
        posts.add(servicesCatalog.getPostService().findById(dto.getPostID()));
        tag.setPosts(posts);

        return tag;
    }
}
