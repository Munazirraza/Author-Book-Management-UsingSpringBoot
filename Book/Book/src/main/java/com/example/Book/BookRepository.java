package com.example.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Custom queries can be added here
    long countByRankingGreaterThan(int rating);
    long countByAuthorNameAndPublishYear(String authorName, int publishYear);
}

