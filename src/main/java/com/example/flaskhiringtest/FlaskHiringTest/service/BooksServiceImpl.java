package com.example.flaskhiringtest.FlaskHiringTest.service;

import com.example.flaskhiringtest.FlaskHiringTest.model.Books;
import com.example.flaskhiringtest.FlaskHiringTest.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    BooksRepository booksRepository;

    @Override
    public List<Books> getAllBooks(){
        List<Books> list = (List<Books>) booksRepository.findAll();
        return list;
    }

    @Override
    public Books addBook(Books newBook) {
        return booksRepository.save(newBook);
    }

    @Override
    public Books getBookByNameAndAuthor(String name, String authors) {
        return booksRepository.findByPublisherAndAuthors(name,authors);
    }
}
