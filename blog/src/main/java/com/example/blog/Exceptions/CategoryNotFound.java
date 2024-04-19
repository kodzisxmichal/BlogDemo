package com.example.blog.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CategoryNotFound extends RuntimeException {

    public CategoryNotFound() {super();}
    public CategoryNotFound(String message) {super(message);}
}
