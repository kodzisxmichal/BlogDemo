package com.example.frontend.services;

import com.example.frontend.models.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class UserService {

    RestClient restClient;

    private static final String DATA_URL = "http://localhost:8080";

    public UserService(){
        restClient = RestClient.create();
    }

    public User findUserById(String id){
        return restClient
                .get().uri(DATA_URL+"/users/id")
                .retrieve()
                .body(User.class);
    }

    public User findUserByUsername(String username){
        return restClient
                .get().uri(DATA_URL+"/users/name")
                .retrieve()
                .body(User.class);
    }

    public List<User> findAllUsers(){
        return restClient
                .get().uri(DATA_URL+"/users")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }

    public void saveUser(User user){
        restClient
                .post().uri(DATA_URL+"/users/add")
                .body(user)
                .retrieve()
                .toBodilessEntity();
    }

    public void deleteUserById(Long id){
        restClient
                .delete().uri(DATA_URL+"/users/delete?id="+id)
                .retrieve()
                .toBodilessEntity();
    }
}
