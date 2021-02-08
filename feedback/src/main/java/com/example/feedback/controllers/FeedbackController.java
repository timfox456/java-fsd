package com.example.feedback.controllers;


import com.example.feedback.model.Feedback;
import com.example.feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeedbackController {


    @Autowired
    private FeedbackRepository repo;


    @GetMapping("/")
    public String showServiceName()
    {
        return "Feedback";
    }

    @GetMapping("/feedback/{id}")
    public Feedback showFeedbackById(@PathVariable Integer id)
    {
        // TODO: Add error handling

        return repo.findById(id).get();

    }


    @PostMapping("/submitfeedback")
    public Feedback addFeedback(@RequestBody Feedback newFeedback) {

        //TODO: Add error handling

        return repo.save(newFeedback);

    }


}
 