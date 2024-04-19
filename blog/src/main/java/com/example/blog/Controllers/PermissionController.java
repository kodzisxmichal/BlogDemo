package com.example.blog.Controllers;

import com.example.blog.Models.Permission;
import com.example.blog.Services.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/permissions")
@RestController
public class PermissionController {

    private final PermissionService permissionService;

    @GetMapping
    public ResponseEntity<List<Permission>> getPermissions() {
        List<Permission> permissions = permissionService.findAll();

        return ResponseEntity.ok(permissions);
    }

    @GetMapping("/id")
    public ResponseEntity<Permission> getPermissionById(@RequestParam Long id) {
        Permission permission = permissionService.findById(id);

        return ResponseEntity.ok(permission);
    }

    @GetMapping("/name")
    public ResponseEntity<List<Permission>> getPermissionsByName(@RequestParam String name) {
        List<Permission> permissions = permissionService.findByName(name);

        return ResponseEntity.ok(permissions);
    }

    @GetMapping("/accessLevel")
    public ResponseEntity<List<Permission>> getPermissionsByAccessLevel(@RequestParam Integer accessLevel) {
        List<Permission> permissions = permissionService.findByAccessLevel(accessLevel);

        return ResponseEntity.ok(permissions);
    }
}
