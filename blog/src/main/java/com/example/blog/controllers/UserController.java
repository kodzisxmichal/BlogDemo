package com.example.blog.controllers;

import com.example.blog.models.User;
import com.example.blog.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAll();

        return ResponseEntity.ok(users);
    }

    @GetMapping("/id")
    public ResponseEntity<User> getUserById(@RequestParam Long id) {
        User user = userService.findById(id);

        return ResponseEntity.ok(user);
    }

    @GetMapping("/name")
    public ResponseEntity<User> getUserByUsername(@RequestParam String username) {
        User user = userService.findByUsername(username);

        return ResponseEntity.ok(user);
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.save(user);

        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<User> deleteUserById(@RequestParam Long id) {
        userService.deleteById(id);

        return ResponseEntity.ok(null);
    }
}
