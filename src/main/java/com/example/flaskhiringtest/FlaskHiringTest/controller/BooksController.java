package com.example.flaskhiringtest.FlaskHiringTest.controller;

import com.example.flaskhiringtest.FlaskHiringTest.model.Books;
import com.example.flaskhiringtest.FlaskHiringTest.service.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private final BooksServiceImpl booksService;

    public BooksController(BooksServiceImpl booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/getAllBooks")
    public List<Books> getAllBooks(){
        return booksService.getAllBooks();
    }


    @PostMapping("/addBook")
    public Books addBook(@RequestBody Books newBook){
        return booksService.addBook(newBook);
    }

    @GetMapping("/getBookByNameAndAuthor/{name:[a-zA-Z &+-]*}/{author:[a-zA-Z &+-]*}")
    public Books getBookByNameAndAuthor(@PathVariable String name, @PathVariable String author){
        System.out.println("this method called");
        return booksService.getBookByNameAndAuthor(name, author);
    }
}
