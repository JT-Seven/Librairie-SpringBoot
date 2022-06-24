package com.intech.librairie.services;

import com.intech.librairie.model.Book;
import com.intech.librairie.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book verifyIfBookExist(String bookName) {
        return bookRepository.findByBookName(bookName);
    }

    public void createBook(Book book) {
        bookRepository.save(book);
    }
}
