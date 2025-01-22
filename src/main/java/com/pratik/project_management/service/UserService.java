package com.pratik.project_management.service;

import com.pratik.project_management.models.User;
import com.pratik.project_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> findUserById(Long userId){
        return userRepository.findById(userId);
    }

    public Optional<User> findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }
}
