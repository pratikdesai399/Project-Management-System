package com.pratik.project_management.controller;

import com.pratik.project_management.model.Users;
import com.pratik.project_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
