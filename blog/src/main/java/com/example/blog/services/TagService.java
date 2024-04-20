package com.example.blog.services;

import com.example.blog.exceptions.TagNotFound;
import com.example.blog.models.Tag;
import com.example.blog.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TagService {

    private final TagRepository tagRepository;

    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    public Tag findById(Long id) {
        return tagRepository.findById(id).orElseThrow(()-> new TagNotFound("Tag with id " + id + " not found"));
    }
}
