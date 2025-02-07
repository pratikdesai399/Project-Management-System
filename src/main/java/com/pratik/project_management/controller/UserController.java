package com.pratik.project_management.controller;

import com.pratik.project_management.model.Users;
import com.pratik.project_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getHello(){
        return "Hello";
    }

    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users users){
        Users savedUsers = userService.saveUser(users);
        return ResponseEntity.ok(savedUsers);
    }

    @GetMapping("/{userId}")
    public Optional<Users> getUserById(@PathVariable Long userId){
        return userService.findById(userId);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }
}
