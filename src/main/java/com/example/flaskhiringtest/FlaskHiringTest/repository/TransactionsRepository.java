package com.example.flaskhiringtest.FlaskHiringTest.repository;

import com.example.flaskhiringtest.FlaskHiringTest.model.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionsRepository extends CrudRepository<Transactions,Long> {

    List<Transactions> findAllByMemberId(long memberId);
    Transactions findByMemberId(long memberId);
}
