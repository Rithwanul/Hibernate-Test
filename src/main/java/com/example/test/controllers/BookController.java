package com.example.test.controllers;

import com.example.test.models.Book;
import com.example.test.repositories.BookRepository;
import com.example.test.service.BookService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/")
    public Book save(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
