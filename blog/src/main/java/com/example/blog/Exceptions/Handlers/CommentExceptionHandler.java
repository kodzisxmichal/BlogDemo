package com.example.blog.Exceptions.Handlers;

import com.example.blog.Exceptions.CommentNotFound;
import com.example.blog.Exceptions.PostNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CommentExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CommentNotFound.class)
    public ResponseEntity<Object> handleCommentNotFound(RuntimeException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
