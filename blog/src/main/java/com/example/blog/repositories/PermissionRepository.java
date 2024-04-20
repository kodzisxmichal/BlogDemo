package com.example.blog.repositories;

import com.example.blog.models.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    public List<Permission> findByName(String name);
    public List<Permission> findByAccessLevel (Integer accessLevel);
}
