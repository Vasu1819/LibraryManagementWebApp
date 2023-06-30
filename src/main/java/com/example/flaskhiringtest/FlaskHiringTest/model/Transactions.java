package com.example.flaskhiringtest.FlaskHiringTest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long transactionId;

    private long memberId;

    private double rentAmount;

//    private double outstandingDebt;
}
