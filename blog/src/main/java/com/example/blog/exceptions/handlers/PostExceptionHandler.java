package com.example.blog.exceptions.handlers;

import com.example.blog.exceptions.PostNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class PostExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PostNotFound.class)
    public ResponseEntity<Object> handlePostNotFound(RuntimeException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
