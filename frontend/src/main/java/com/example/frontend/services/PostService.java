package com.example.frontend.services;

import com.example.frontend.models.DTOs.PostDTO;
import com.example.frontend.models.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class PostService {
    private static final Logger log = LoggerFactory.getLogger(PostService.class);
    RestClient restClient;

    private static final String DATA_URL = "http://localhost:8080";

    public PostService(){
        restClient = RestClient.create();
    }

    public Post findPostById(String id){
        return restClient
                .get().uri(DATA_URL+"/posts/id")
                .retrieve()
                .body(Post.class);
    }

    public List<Post> findAllPosts(){
        return restClient
                .get().uri(DATA_URL+"/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }

    public void savePost(PostDTO postDto){
        postDto.setAuthorID(2L);
        restClient
                .post().uri(DATA_URL + "/posts/add")
                .contentType(MediaType.APPLICATION_JSON)
                .body(postDto)
                .retrieve()
                .toBodilessEntity();

        log.info("Calling backend with post request with postDTO");
    }
}
