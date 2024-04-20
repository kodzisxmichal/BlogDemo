package com.example.blog.services;

import com.example.blog.exceptions.CategoryNotFound;
import com.example.blog.models.Category;
import com.example.blog.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        return categoryRepository.findById(id).orElseThrow(()-> new CategoryNotFound("Category with id " + id + " not found"));
    }
}
