package com.pratik.project_management.service;

import com.pratik.project_management.model.Users;
import com.pratik.project_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users saveUser(Users users){
        return userRepository.save(users);
    }

    public Optional<Users> findById(Long userId){
        return userRepository.findById(userId);
    }

    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }
}
