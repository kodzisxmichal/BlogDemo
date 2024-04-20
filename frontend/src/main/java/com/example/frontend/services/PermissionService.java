package com.example.frontend.services;

import com.example.frontend.models.Permission;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class PermissionService {
    RestClient restClient;

    private static final String DATA_URL = "http://localhost:8080";

    public PermissionService(){
        restClient = RestClient.create();
    }

    public Permission findPermissionById(String id){
        return restClient
                .get().uri(DATA_URL+"/permissions/id")
                .retrieve()
                .body(Permission.class);
    }

    public List<Permission> findAllPermissions(){
        return restClient
                .get().uri(DATA_URL+"/permissions")
                .retrieve()
                .body(new ParameterizedTypeReference<>() {});
    }
}
