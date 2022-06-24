package com.intech.librairie.repository;

import com.intech.librairie.model.Author;
import com.intech.librairie.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    Book findByBookName(String bookName);
}
