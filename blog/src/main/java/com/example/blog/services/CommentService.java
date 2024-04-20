package com.example.blog.services;

import com.example.blog.exceptions.CommentNotFound;
import com.example.blog.models.Comment;
import com.example.blog.repositories.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Comment findById(Long id) {
        return commentRepository.findById(id).orElseThrow(() -> new CommentNotFound("Comment with id " + id + " not found"));
    }

    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }
}
