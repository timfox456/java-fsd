package com.example.TaskManager;


import com.example.TaskManager.entities.Task;
import com.example.TaskManager.repositories.TaskRepository;
import com.example.TaskManager.repositories.UserRepository;
import com.example.TaskManager.services.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Date;

@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TaskDataTests {


/*
    @Autowired
    private TestEntityManager entityManager;


    @Autowired
    private TaskRepository taskRepository;



    @Autowired
    private UserRepository userRepository;


    @Autowired
    private TaskService taskService;
*/

    @Test
    public void addTask_theReturnTask(){
        /*
        Task task = new Task();
        task.setName("Task 1");
        task.setEmail("myemail@email.com");
        task.setSeverity("High");
        task.setDescription("This is the Task");
        task.setUser(userRepository.findById(1).get());

        taskService.AddTask(task);
        */


    }
}
