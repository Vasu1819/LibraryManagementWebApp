package com.example.flaskhiringtest.FlaskHiringTest.service;

import com.example.flaskhiringtest.FlaskHiringTest.model.Books;
import com.example.flaskhiringtest.FlaskHiringTest.model.Members;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface MembersService {

    Members issueBook(Members memberIssueBook);

    List<Members> getAllMembers();

    Members issuedBookReturn(long memberId, long bookId, String returnDate);
}
