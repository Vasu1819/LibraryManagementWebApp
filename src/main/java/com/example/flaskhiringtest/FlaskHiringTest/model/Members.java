package com.example.flaskhiringtest.FlaskHiringTest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long memberId;

    private long issuedBookId;

    private String issuedBookDate;

    private String issuedBookReturnDate;


}
