package com.pratik.project_management.service;

import com.pratik.project_management.model.Users;
import com.pratik.project_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users saveUser(Users users){
        return userRepository.save(users);
    }
}
