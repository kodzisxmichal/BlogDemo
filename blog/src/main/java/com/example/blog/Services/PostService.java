package com.example.blog.Services;


import com.example.blog.Exceptions.PostNotFound;
import com.example.blog.Models.Post;
import com.example.blog.Repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findById(Long id) {
        return postRepository.findById(id).orElseThrow(() -> new PostNotFound("Post with id: " + id + "was not found"));
    }

    public void save(Post post) {
        log.info("Saving post with id: " + post.getID());
        postRepository.save(post);
    }

    public void deleteById(Long id) {
        postRepository.deleteById(id);
    }


}
