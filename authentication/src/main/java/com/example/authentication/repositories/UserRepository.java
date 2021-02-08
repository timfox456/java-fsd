package com.example.authentication.repositories;

import com.example.authentication.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);

}
