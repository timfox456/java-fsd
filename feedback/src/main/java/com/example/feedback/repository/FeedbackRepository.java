package com.example.feedback.repository;

import com.example.feedback.model.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

}
