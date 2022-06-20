package com.intech.librairie.controller;

import com.intech.librairie.config.ApiResponse;
import com.intech.librairie.model.Author;
import com.intech.librairie.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Objects;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/createAuthor")
    public ResponseEntity<ApiResponse> createAuthor(@Valid @RequestBody Author author) {
        if (Objects.nonNull(authorService.readAuthor(author.getFirstName()))) {
            return new ResponseEntity<>(new ApiResponse(false, "author already exists"), HttpStatus.CONFLICT);
        }
        authorService.createAuthor(author);
        return new ResponseEntity<>(new ApiResponse(true, "created the author"), HttpStatus.CREATED);
    }
}
