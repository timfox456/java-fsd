package com.example.Capstone.entities;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Album {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String Name;

    @ManyToOne
    private Genre genre;

    private String artist;

    private Date releaseDate;

    private BigDecimal price;


}
