package com.example.frontend.services.security;


import com.example.frontend.models.User;
import com.example.frontend.services.ServiceCatalog;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final ServiceCatalog serviceCatalog;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = serviceCatalog.getUserService().findUserByUsername(username);

        return new MyUserDetails(user.getUsername(), user.getPassword(), new ArrayList<>());
    }
}
