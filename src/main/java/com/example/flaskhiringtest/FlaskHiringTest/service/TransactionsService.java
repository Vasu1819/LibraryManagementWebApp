package com.example.flaskhiringtest.FlaskHiringTest.service;

import com.example.flaskhiringtest.FlaskHiringTest.model.Transactions;

import java.util.List;

public interface TransactionsService {

    List<Transactions> getAllTransactions();

    List<Transactions> getMemberTransactions(long memberId);

    Transactions createTransaction(long memberId);
}
