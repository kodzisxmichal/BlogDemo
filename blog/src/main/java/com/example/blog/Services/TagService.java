package com.example.blog.Services;

import com.example.blog.Exceptions.TagNotFound;
import com.example.blog.Models.Tag;
import com.example.blog.Repositories.TagRepository;
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
