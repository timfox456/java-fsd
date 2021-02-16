package com.example.TaskManager.controllers;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TaskController {

    @Autowired
    TaskService taskService;


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
    public String submitCreateTask(ModelMap model, @RequestParam String name, @RequestParam String startdate){


        model.put("name", name);

        return "display-tasks";
    }

}
