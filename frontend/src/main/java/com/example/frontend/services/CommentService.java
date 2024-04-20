package com.example.frontend.services;

import com.example.frontend.models.Comment;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class CommentService {

    RestClient restClient;

    private static final String DATA_URL = "http://localhost:8080";

    public CommentService(){
        restClient = RestClient.create();
    }

    public Comment findCommentById(String id){
        return restClient
                .get().uri(DATA_URL+"/comments/id")
                .retrieve()
                .body(Comment.class);
    }

    public List<Comment> findAllComments(){
        return restClient
                .get().uri(DATA_URL+"/comments")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }

}
