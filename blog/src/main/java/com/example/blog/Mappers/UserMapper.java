package com.example.blog.Mappers;

import com.example.blog.Models.DTOs.UserDTO;
import com.example.blog.Models.User;
import com.example.blog.Services.ServicesCatalog;
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
