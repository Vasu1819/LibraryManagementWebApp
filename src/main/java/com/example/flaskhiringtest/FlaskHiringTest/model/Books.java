package com.example.flaskhiringtest.FlaskHiringTest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.dynalink.linker.LinkerServices;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;

    private String title;

    private String authors;

    private double average_rating;

    private long isbn;

    private long isbn13;

    private String language_code;

    private int num_pages;

    private long ratings_count;

    private long text_reviews_count;

    private String publication_date;

    private String publisher;
}
