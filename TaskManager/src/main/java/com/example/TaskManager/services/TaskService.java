package com.example.TaskManager.services;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.exceptions.TaskNotFoundException;
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

    //TODO: Should GetTaskById return Task rather than Optional<Task>?
    public Optional<Task> GetTaskById(Integer id) throws TaskNotFoundException {
        Optional<Task> foundTask = taskRepository.findById(id);

        if (!foundTask.isPresent()) {
            throw new TaskNotFoundException(id);
        }
        return (foundTask);
    }

    public Task AddTask(Task task) {
        return taskRepository.save(task);
    }

    public void DeleteTask(Task task) {
        taskRepository.delete(task);
    }


}
