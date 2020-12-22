package com.project.bookservice.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bookservice.models.Book;
import com.project.bookservice.models.BookList;
import com.project.bookservice.services.BookService;


@RestController
public class BookController {
	@GetMapping("/books")
	public ResponseEntity<BookList> getBookList(){ 
		BookList bookList=new BookList();
		bookList.setBooks(BookService.getBookList());
	    return ResponseEntity.ok(bookList);    
	}
	@RequestMapping("/books/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		Book b= BookService.getBookList().stream().filter(book->id==book.getId()).findAny().orElse(null);
		return b;
	}
}
