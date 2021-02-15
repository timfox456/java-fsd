package com.example.TaskManager.repositories;

import com.example.TaskManager.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer>{
}
