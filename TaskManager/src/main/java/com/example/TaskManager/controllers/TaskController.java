package com.example.TaskManager.controllers;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.exceptions.TaskNotFoundException;
import com.example.TaskManager.services.TaskService;
import com.example.TaskManager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Optional;

@Controller
@SessionAttributes("name")
public class TaskController {

    @Autowired
    TaskService taskService;

    @Autowired
    UserService userService;



    @RequestMapping(value = "/display-tasks", method = RequestMethod.GET)
    public String displayTasks(ModelMap model) {
        String name = (String) model.get("name");
        Iterable<Task> tasks = taskService.GetAllTasks();

        model.put("tasks", taskService.GetAllTasks());
        return "display-tasks";
    }

    @RequestMapping(value = "/create-task", method = RequestMethod.GET)
    public String showCreateTask(ModelMap model) {

        return "create-task";
    }


    @RequestMapping(value="/create-task", method = RequestMethod.POST)
    public String submitCreateTask(ModelMap model,
                                   @RequestParam String name,
                                   @RequestParam Date startdate,
                                   @RequestParam Date enddate,
                                   @RequestParam String description,
                                   @RequestParam String email,
                                   @RequestParam String severity,
                                   @RequestParam String user){


        model.put("name", name);

        Task task = new Task();
        task.setName(name);


        task.setStartDate(startdate);
        task.setEndDate(enddate);
        task.setDescription(description);
        task.setEmail(email);
        task.setSeverity(severity);

        //TODO: Handle case where User is not found.
        User retrievedUser = userService.GetUserByName(user);
        task.setUser(retrievedUser);

        taskService.AddTask(task);
        return "display-tasks";
    }

    @RequestMapping(value = "/update-task", method = RequestMethod.GET)
    public String showUpdateTask(ModelMap model) {

        Integer id = (Integer) model.get("taskid");

        Optional<Task> task;
        try {
            task = taskService.GetTaskById(id);
        }
        catch(TaskNotFoundException ex) {
            model.put("Error", "not-found-error");
             //return "not-found-error";
        }

        return "create-task";
    }

}
