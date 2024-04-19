package com.example.blog.Controllers;

import com.example.blog.Models.Comment;
import com.example.blog.Services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/comments")
@Controller
public class CommentController {

    private final CommentService commentService;

    @GetMapping
    public ResponseEntity<List<Comment>> getComments() {
        List<Comment> comments = commentService.findAll();

        return ResponseEntity.ok(comments);
    }

    @GetMapping("/id")
    public ResponseEntity<Comment> getCommentById(@RequestParam Long id) {
        Comment comment = commentService.findById(id);

        return ResponseEntity.ok(comment);
    }

    @PostMapping("/add")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
        commentService.save(comment);

        return ResponseEntity.ok(comment);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Comment> deleteCommentById(@RequestParam Long id) {
        commentService.deleteById(id);

        return ResponseEntity.ok(null);
    }
}
