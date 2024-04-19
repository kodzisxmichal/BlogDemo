package com.example.frontend.Services;

import com.example.frontend.Models.Tag;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class TagService {

    RestClient restClient;

    private static final String DATA_URL = "http://localhost:8080";

    public TagService(){
        restClient = RestClient.create();
    }

    public Tag findTagById(String id){
        return restClient
                .get().uri(DATA_URL+"/tags/id")
                .retrieve()
                .body(Tag.class);
    }

    public List<Tag> findAllTags(){
        return restClient
                .get().uri(DATA_URL+"/tags")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }
}
