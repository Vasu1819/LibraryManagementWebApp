package com.example.flaskhiringtest.FlaskHiringTest.service;

import com.example.flaskhiringtest.FlaskHiringTest.model.Transactions;
import com.example.flaskhiringtest.FlaskHiringTest.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionsServiceImpl implements TransactionsService {

    @Autowired
    TransactionsRepository transactionsRepository;

    @Override
    public List<Transactions> getAllTransactions() {
        List list = (List<Transactions>) transactionsRepository.findAll();
        return list;
    }

    @Override
    public List<Transactions> getMemberTransactions(long memberId) {
        List list = transactionsRepository.findAllByMemberId(memberId);
        return list;
    }

    @Override
    public Transactions createTransaction(long memberId) {
        Transactions transaction = transactionsRepository.findByMemberId(memberId);
        transaction.setRentAmount(100d);
        return transaction;
    }
}
