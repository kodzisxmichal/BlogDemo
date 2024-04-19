package com.example.blog.Exceptions;

import org.aspectj.bridge.IMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PostNotFound extends RuntimeException {

    public PostNotFound() {super();}
    public PostNotFound(String message) { super(message); }
}
