package com.example.feedback.model;

import javax.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int rating;

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    String user;

    String comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public String getUser() {
        return user;
    }

    public String getComments() {
        return comments;
    }

}
