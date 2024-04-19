package com.example.frontend.Services;

import com.example.frontend.Models.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
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

    public void loginUser(LoginDTO loginDTO){
        restClient
                .post().uri(DATA_URL+"/users/login")
                .body(loginDTO)
                .contentType(MediaType.APPLICATION_JSON)
                .body(loginDTO)
                .retrieve()
                .toBodilessEntity();
    }
}
