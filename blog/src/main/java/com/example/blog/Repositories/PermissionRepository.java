package com.example.blog.Repositories;

import com.example.blog.Models.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    public List<Permission> findByName(String name);
    public List<Permission> findByAccessLevel (Integer accessLevel);
}
