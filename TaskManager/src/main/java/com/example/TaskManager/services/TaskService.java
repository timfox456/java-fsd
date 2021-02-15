package com.example.TaskManager.services;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Iterable<Task> GetAllTasks()
    {
        return taskRepository.findAll();
    }

    public Optional<Task> GetTaskById(Integer id) {
        return taskRepository.findById(id);
    }

    public Task AddTask(Task task) {
        return taskRepository.save(task);
    }

    public void DeleteTask(Task task) {
        taskRepository.delete(task);
    }


}
