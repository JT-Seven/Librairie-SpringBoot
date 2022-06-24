package com.intech.librairie.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "book")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String bookName;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    private String dateOfPublic;

}
