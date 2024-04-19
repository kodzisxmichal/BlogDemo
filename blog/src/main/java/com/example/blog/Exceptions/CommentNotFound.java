package com.example.blog.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CommentNotFound extends RuntimeException {

    public CommentNotFound() {super();}
    public CommentNotFound(String message) {super(message);}
}
