package com.example.test.serviceImpl;

import com.example.test.annotations.LogEntryExit;
import com.example.test.exceptions.RessourceNotFoundException;
import com.example.test.model.User;
import com.example.test.repository.UserRepository;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @LogEntryExit(showArgs = true, showResult = true, unit = ChronoUnit.MILLIS)
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @LogEntryExit(showArgs = true, showResult = true, unit = ChronoUnit.MILLIS)
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @LogEntryExit(showArgs = true, showResult = true, unit = ChronoUnit.MILLIS)
    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RessourceNotFoundException("Employee not exist with id: "+ userId));
    }
}
