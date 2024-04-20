package com.example.frontend.services;

import com.example.frontend.models.Category;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class CategoryService {

    RestClient restClient;

    private static final String DATA_URL = "http://localhost:8080";

    public CategoryService() {
        restClient = RestClient.create();
    }

    public Category findCategoryById(int id) {

        return restClient
                .get().uri(DATA_URL+"/categories/id")
                .retrieve()
                .body(Category.class);
    }

    public List<Category> findAllCategories() {

         return restClient
                .get().uri(DATA_URL+"/categories")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }
}
