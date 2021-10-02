package com.example.test.controller;

import com.example.test.model.User;
import com.example.test.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    //register user rest api
    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user)
    {
        return ResponseEntity.ok(userService.saveUser(user));
    }

    //get all users rest api
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers()
    {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    //get user by id rest api
    @GetMapping("/id/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id)
    {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    //get user by username rest api
    @GetMapping("/username/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username)
    {
        return ResponseEntity.ok(userService.getUserByUsername(username));
    }
}
