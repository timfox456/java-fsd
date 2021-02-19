package com.example.TaskManager.services;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.exceptions.TaskNotFoundException;
import com.example.TaskManager.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.TaskManager.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User GetUserByName(String name) {
        User foundUser = userRepository.findByName(name);
        return foundUser;
    }
}
