package com.example.blog.services;

import com.example.blog.exceptions.PermissionNotFound;
import com.example.blog.models.Permission;
import com.example.blog.repositories.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PermissionService {

    private final PermissionRepository permissionRepository;

    public List<Permission> findAll() {
        return permissionRepository.findAll();
    }

    public Permission findById(Long id) {
        return permissionRepository.findById(id).orElseThrow(()-> new PermissionNotFound("Permission with id " + id + " not found"));
    }

    public List<Permission> findByName(String name) {
        return permissionRepository.findByName(name);
    }

    public List<Permission> findByAccessLevel(Integer accessLevel) {
        return permissionRepository.findByAccessLevel(accessLevel);
    }
}
