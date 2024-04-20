package com.example.blog.controllers;

import com.example.blog.models.Tag;
import com.example.blog.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/tags")
@RestController
public class TagController {

    private final TagService tagService;

    @GetMapping
    public ResponseEntity<List<Tag>> getAllTags() {
        List<Tag> tags = tagService.findAll();

        return ResponseEntity.ok(tags);
    }

    @GetMapping("/id")
    public ResponseEntity<Tag> getTagById(@RequestParam Long id) {
        Tag tag = tagService.findById(id);

        return ResponseEntity.ok(tag);
    }

}
