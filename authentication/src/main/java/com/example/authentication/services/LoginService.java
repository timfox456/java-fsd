package com.example.authentication.services;

import com.example.authentication.models.User;
import com.example.authentication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public boolean AddUser(User newUser) {
        if (newUser == null) return false;
        userRepository.save(newUser);
        return true;
    }

    public User GetUserByName(String name) {
        Iterable<User> users = userRepository.findAll();

        for (User user : users) {
            if(user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public boolean AuthenticateUser(User user, String enteredPassword)
    {
        return (user.getPassword().equals(enteredPassword));
    }

}
