package com.example.test.service;

import com.example.test.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long userId);
}
