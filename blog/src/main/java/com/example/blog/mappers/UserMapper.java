package com.example.blog.mappers;

import com.example.blog.models.DTOs.UserDTO;
import com.example.blog.models.User;
import com.example.blog.services.ServicesCatalog;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserMapper implements IMap<UserDTO, User>{

    private final ServicesCatalog servicesCatalog;

    @Override
    public User map(UserDTO dto) {

        User user = new User();

        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        user.setAvatarURL(dto.getAvatarURL());
        user.setPermission(servicesCatalog.getPermissionService().findById(2L));

        return user;
    }
}
