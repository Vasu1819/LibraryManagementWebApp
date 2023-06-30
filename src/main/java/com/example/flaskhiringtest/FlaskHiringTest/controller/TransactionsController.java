package com.example.flaskhiringtest.FlaskHiringTest.controller;

import com.example.flaskhiringtest.FlaskHiringTest.model.Transactions;
import com.example.flaskhiringtest.FlaskHiringTest.service.TransactionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {

    @Autowired
    TransactionsServiceImpl transactionsService;

    @GetMapping("/getAllTransactions")
    public List<Transactions> getAllTransactions(){
        return transactionsService.getAllTransactions();
    }

    @GetMapping("/getMemberTransactions/{memberId}")
    public List<Transactions> getMemberTransactions(@PathVariable long memberId){
        return transactionsService.getMemberTransactions(memberId);
    }

    @PostMapping("/createTransaction/{memberId}")
    public Transactions createTransaction(@PathVariable long memberId){
        return transactionsService.createTransaction(memberId);
    }
}
