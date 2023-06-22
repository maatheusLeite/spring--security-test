package com.matheuslt.booklibrary.controllers.dtos;

import com.matheuslt.booklibrary.models.Author;

public class BookDto {
	
	private String name;
	
	private Author author;
	
	public BookDto() {
	}

	public BookDto(String name, Author author) {
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
