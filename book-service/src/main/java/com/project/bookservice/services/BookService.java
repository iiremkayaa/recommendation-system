package com.project.bookservice.services;

import java.util.Arrays;
import java.util.List;

import com.project.bookservice.models.Book;


public class BookService {
	private static List<Book> bookList = Arrays.asList(
			new Book(1,"War and Peace","Tolstoy"),
			new Book(2,"The Trial","Franz Kafka")
			);
	public static List<Book> getBookList() {
	        return bookList;
	}
}
