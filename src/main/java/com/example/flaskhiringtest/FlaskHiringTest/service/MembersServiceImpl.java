package com.example.flaskhiringtest.FlaskHiringTest.service;

import com.example.flaskhiringtest.FlaskHiringTest.exception.NoBookRecordFoundException;
import com.example.flaskhiringtest.FlaskHiringTest.exception.NoMemberFoundException;
import com.example.flaskhiringtest.FlaskHiringTest.model.Members;
import com.example.flaskhiringtest.FlaskHiringTest.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MembersServiceImpl implements MembersService {

    @Autowired
    MembersRepository membersRepository;

    @Override
    public Members issueBook(Members memberIssueBook) {
        return membersRepository.save(memberIssueBook);
    }

    @Override
    public Members issuedBookReturn(long memberId, long bookId, String returnDate) {
        Members member = membersRepository.findById(memberId).orElseThrow(()-> new NoMemberFoundException("No Member Found"));
        if(member.getIssuedBookId() == bookId){
            member.setIssuedBookReturnDate(returnDate);
            membersRepository.save(member);
            return member;
        }else{
            throw new NoBookRecordFoundException("No Book Record Found");
        }
    }

    @Override
    public List<Members> getAllMembers() {
        List list = (List<Members>) membersRepository.findAll();
        return list;
    }
}
