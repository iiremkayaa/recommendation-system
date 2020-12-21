package com.project.recommendationservice.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class BookList {
	@Getter
	@Setter
	private List<Book> books;

	public BookList(List<Book> books) {
		super();
		this.books = books;
	}

	public BookList() {

	}
}
