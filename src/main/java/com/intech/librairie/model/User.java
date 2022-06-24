package com.intech.librairie.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "library_user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "library_user_name")
    private String userName;
    @Column(name = "library_user_email")
    private String userEmail;
    @Column(name = "library_user_loaned_book")
    private List<Book> userLoanedBook;

}
