package com.intech.librairie.services;

import com.intech.librairie.model.Author;
import com.intech.librairie.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author readAuthor(String authorName) {
        return authorRepository.findByAuthorName(authorName);
    }

    public void createAuthor(Author author) {
        authorRepository.save(author);
    }
}
