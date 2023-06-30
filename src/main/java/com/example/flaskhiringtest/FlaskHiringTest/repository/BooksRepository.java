package com.example.flaskhiringtest.FlaskHiringTest.repository;

import com.example.flaskhiringtest.FlaskHiringTest.model.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends CrudRepository<Books,Long> {

    // custom method, as can see, Publisher and Authors need to be same in the methodName as in Books Model class
    // variables. Parameters name and authors can be different as required. It's because with this naming CrudRepo
    // makes a query call automatically
    Books findByPublisherAndAuthors(String name, String authors);
}
