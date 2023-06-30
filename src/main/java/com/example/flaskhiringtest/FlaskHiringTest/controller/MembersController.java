package com.example.flaskhiringtest.FlaskHiringTest.controller;

import com.example.flaskhiringtest.FlaskHiringTest.model.Books;
import com.example.flaskhiringtest.FlaskHiringTest.model.Members;
import com.example.flaskhiringtest.FlaskHiringTest.service.MembersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MembersController {

    @Autowired
    MembersServiceImpl membersService;

    @GetMapping("/getAllMembers")
    public List<Members> getAllMembers(){
        return membersService.getAllMembers();
    }

    @PostMapping("/issueBook")
    public Members issueBook(@RequestBody Members memberIssueBook) {
        return membersService.issueBook(memberIssueBook);
    }

    @PutMapping("/issuedBookReturn/{memberId}/{bookId}/{returnDate}")
    public Members issuedBookReturn(@PathVariable long memberId, @PathVariable long bookId, @PathVariable String returnDate){
        return membersService.issuedBookReturn(memberId,bookId,returnDate);
    }
}
