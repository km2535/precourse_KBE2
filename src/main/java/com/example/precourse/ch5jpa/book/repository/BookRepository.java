package com.example.precourse.ch5jpa.book.repository;

import com.example.precourse.ch5jpa.book.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
