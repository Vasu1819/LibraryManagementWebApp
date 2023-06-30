package com.example.flaskhiringtest.FlaskHiringTest.repository;

import com.example.flaskhiringtest.FlaskHiringTest.model.Members;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends CrudRepository<Members,Long> {

//    Members findByIdAndIssuedBookId(long memberId, long issuedBookId);
}
