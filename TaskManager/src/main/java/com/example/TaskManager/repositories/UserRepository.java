package com.example.TaskManager.repositories;

import com.example.TaskManager.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository  extends CrudRepository<User, Integer> {

    public User findByName(String name);
}
