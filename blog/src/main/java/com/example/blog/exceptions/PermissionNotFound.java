package com.example.blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PermissionNotFound extends RuntimeException {

    public PermissionNotFound() {super();}
    public PermissionNotFound(String message) {super(message);}
}
