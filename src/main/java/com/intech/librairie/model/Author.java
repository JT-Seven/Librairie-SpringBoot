package com.intech.librairie.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "auhtor")
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "author_name")
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Author(String name, String lastName, String dateOfBirth) {
        this.firstName = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
}
