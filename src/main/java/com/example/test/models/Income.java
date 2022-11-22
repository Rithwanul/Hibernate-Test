package com.example.test.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_income")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    public Income() {
    }


}
