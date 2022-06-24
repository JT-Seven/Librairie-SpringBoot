package com.intech.librairie.dto;

import com.intech.librairie.model.Author;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
public class BookDto {
    private String bookName;
    private Integer authorId;
    private String dateOfPublic;

}
