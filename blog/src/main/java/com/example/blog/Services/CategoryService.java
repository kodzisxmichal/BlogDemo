package com.example.blog.Services;

import com.example.blog.Exceptions.CategoryNotFound;
import com.example.blog.Models.Category;
import com.example.blog.Repositories.CategoryRepository;
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
