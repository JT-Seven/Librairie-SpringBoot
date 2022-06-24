package com.intech.librairie.services;

import com.intech.librairie.model.Author;
import com.intech.librairie.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public boolean existAuthorById(int id) {
        return authorRepository.existsAuthorById(id);
    }

    public Author findAuthorById(int id) {
        return authorRepository.findById(id);
    }

    public void createAuthor(Author author) {
        authorRepository.save(author);
    }
}
