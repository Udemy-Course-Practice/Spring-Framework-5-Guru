package com.example.demo.bootstrap;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.domain.Publisher;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class BootstrapData implements CommandLineRunner {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = Publisher.builder().name("Tuổi Trẻ").addressLine1("Bắc Ninh").zip("790000").city("Bắc Ninh").build();
        Author author1 = Author.builder().firstName("Vinh").lastName("Nguyen").books(new HashSet<>()).build();
        Book book1 = Book.builder().title("Java Simple").isbn("132453511").authors(new HashSet<>()).build();
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        publisherRepository.save(publisher);
        book1.setPublisher(publisher);
        authorRepository.save(author1);
        bookRepository.save(book1);
        System.out.println("Started bootstrap data");
        System.out.println("Books = " + bookRepository.count());
    }
}
