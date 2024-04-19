package com.example.blog.Exceptions.Handlers;

import com.example.blog.Exceptions.TagNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TagExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TagNotFound.class)
    public ResponseEntity<Object> handleTagNotFound(Exception ex, WebRequest request) {
        return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
