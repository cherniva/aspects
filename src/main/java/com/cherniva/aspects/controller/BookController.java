package com.cherniva.aspects.controller;

import com.cherniva.aspects.model.Book;
import com.cherniva.aspects.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{title}")
    public Book getBookByTitle(@PathVariable String title) {
        return bookService.getBookByTitle(title);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
    }
}
