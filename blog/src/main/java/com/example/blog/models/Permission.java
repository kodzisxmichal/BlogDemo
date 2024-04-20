package com.example.blog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Entity
public class Permission {

    public Permission(Long Id, String name, Integer accessLevel){
        this.ID = Id;
        this.name = name;
        this.accessLevel = accessLevel;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    private Integer accessLevel;

    public void setID(Long id) {
        this.ID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }
}
