package com.matheuslt.booklibrary.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.matheuslt.booklibrary.models.Book;
import com.matheuslt.booklibrary.repositories.BookRepository;

import jakarta.transaction.Transactional;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repository;
	
	public Page<Book> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}
	
	public Optional<Book> findById(UUID id) {
		return repository.findById(id);
	}
	
	@Transactional
	public Book save(Book book) {
		return repository.save(book);
	}
	
	@Transactional
	public void delete(Book book) {
		repository.delete(book);
	}
}
