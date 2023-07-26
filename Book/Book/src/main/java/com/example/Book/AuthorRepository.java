package com.example.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    long countByRatingGreaterThan(int rating);
}
