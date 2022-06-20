package com.intech.librairie.repository;

import com.intech.librairie.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
    Author findByAuthorName(String authorName);
}