package com.example.blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TagNotFound extends RuntimeException {
    public TagNotFound() {super();}
    public TagNotFound(String message) {super(message);}
}
