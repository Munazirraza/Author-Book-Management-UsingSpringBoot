package com.example.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookAuthorManagementController {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/authors")
    public Author addAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/total-books-by-author-rating/{rating}")
    public long getTotalBooksByAuthorRatingGreaterThan(@PathVariable int rating) {
        return bookRepository.countByRankingGreaterThan(rating);
    }

    @GetMapping("/total-books-published-by-author")
    public long getTotalBooksPublishedByAuthorInYear(@RequestParam String authorName, @RequestParam int publishYear) {
        return bookRepository.countByAuthorNameAndPublishYear(authorName, publishYear);
    }
}

