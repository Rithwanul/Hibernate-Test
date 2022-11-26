package com.example.test.controllers;

import com.example.test.models.Book;
import com.example.test.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;


    private Logger logger = Logger.getLogger("com.simple.test");

    @PostMapping("/")
    public Book save(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
