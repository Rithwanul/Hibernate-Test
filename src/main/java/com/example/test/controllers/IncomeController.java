package com.example.test.controllers;

import com.example.test.repositories.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/income")
public class IncomeController {

    @Autowired
    private IncomeRepository incomeRepository;

    @GetMapping("/")
    public ResponseEntity<String> getAllIncome() {
        return new ResponseEntity<>("Dico", HttpStatus.OK);
    }
}
