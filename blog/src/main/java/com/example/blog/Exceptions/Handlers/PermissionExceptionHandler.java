package com.example.blog.Exceptions.Handlers;

import com.example.blog.Exceptions.PermissionNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class PermissionExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PermissionNotFound.class)
    public ResponseEntity<Object> handlePermissionNotFound(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
