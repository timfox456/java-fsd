package com.example.TaskManager.exceptions;



public class TaskNotFoundException extends RuntimeException  {

    public TaskNotFoundException(Integer id) {
        super("Could not find task " + id);
    }
}
