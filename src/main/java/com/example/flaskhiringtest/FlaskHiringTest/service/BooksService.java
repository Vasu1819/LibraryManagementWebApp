package com.example.flaskhiringtest.FlaskHiringTest.service;

import com.example.flaskhiringtest.FlaskHiringTest.model.Books;

import java.util.List;

public interface BooksService {
    List<Books> getAllBooks();
    Books addBook(Books newBook);
    Books getBookByNameAndAuthor(String publisher, String authors);
}
