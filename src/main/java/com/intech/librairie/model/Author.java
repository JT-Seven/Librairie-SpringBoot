package com.intech.librairie.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "library_author")
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "author_firstname")
    private String firstName;
    @Column(name = "author_lastname")
    private String lastName;
    @Column(name = "author_date_of_birth")
    private String dateOfBirth;

}
