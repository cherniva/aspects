package com.cherniva.aspects.bootstrap;

import com.cherniva.aspects.model.Book;
import com.cherniva.aspects.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Book book1 = Book.builder().title("Title1").author("Author1").build();
        Book book2 = Book.builder().title("Title2").author("Author2").build();

        bookRepository.saveAll(List.of(book1, book2));
    }
}
