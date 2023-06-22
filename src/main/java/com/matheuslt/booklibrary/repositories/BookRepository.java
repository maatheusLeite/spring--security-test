package com.matheuslt.booklibrary.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuslt.booklibrary.models.Book;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
