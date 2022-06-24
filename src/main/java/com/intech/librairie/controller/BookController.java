package com.intech.librairie.controller;

import com.intech.librairie.config.ApiResponse;
import com.intech.librairie.dto.BookDto;
import com.intech.librairie.model.Author;
import com.intech.librairie.model.Book;
import com.intech.librairie.services.AuthorService;
import com.intech.librairie.services.BookService;
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
@RequestMapping("/book")
public class BookController {

    @Autowired //injection de dependance pour recuperer une instance de book service
    private BookService bookService;
    @Autowired
    private AuthorService authorService;

    @PostMapping("/createBook")
    public ResponseEntity<ApiResponse> createBook(@Valid @RequestBody BookDto bookDto) {

        if(!authorService.existAuthorById(bookDto.getAuthorId())) {
            return new ResponseEntity<>(new ApiResponse(false, "author doesn't exist"), HttpStatus.CONFLICT);
        }
        Author author = authorService.findAuthorById(bookDto.getAuthorId());
        Book book = new Book();
        book.setBookName(bookDto.getBookName());
        book.setAuthor(author);
        book.setDateOfPublic(bookDto.getDateOfPublic());

        bookService.createBook(book);
        return  new ResponseEntity<>(new ApiResponse(true, "book created"), HttpStatus.CREATED);
    }
}
