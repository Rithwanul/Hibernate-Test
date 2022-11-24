package com.example.test.service.implementations;

import com.example.test.models.Book;
import com.example.test.repositories.BookRepository;
import com.example.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImplementation implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
