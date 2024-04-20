package com.example.blog.controllers;

import com.example.blog.mappers.PostMapper;
import com.example.blog.models.Post;
import com.example.blog.services.PostService;
import com.example.blog.models.DTOs.PostDTO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/posts")
@RestController
public class PostController {

    private static final Logger log = LoggerFactory.getLogger(PostController.class);
    private final PostService postService;
    private final PostMapper postMapper;

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = postService.findAll();

        return ResponseEntity.ok(posts);
    }

    @GetMapping("/id")
    public ResponseEntity<Post> getPostById(@RequestParam Long id) {
        Post post = postService.findById(id);

        return ResponseEntity.ok(post);
    }

    @PostMapping("/add")
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDto) {
        log.info("Mapping new post: {}", postDto);
        Post post = postMapper.map(postDto);
        log.info("Saving post: {}", post);
        postService.save(post);

        return ResponseEntity.ok(postDto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Post> deletePost(@RequestBody Long id) {
        postService.deleteById(id);

        return ResponseEntity.ok(null);
    }

}
