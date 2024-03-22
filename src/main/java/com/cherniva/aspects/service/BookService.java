package com.cherniva.aspects.service;

import com.cherniva.aspects.model.Book;
import com.cherniva.aspects.repo.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    public Book getBookByTitle(String title) {
        Optional<Book> optionalBook = bookRepository.findByTitle(title);

        return optionalBook.orElse(null);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
}
