package com.project.recommendationservice.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.recommendationservice.models.Book;
import com.project.recommendationservice.models.BookList;

@FeignClient("book-service")
public interface BookClient {
	@GetMapping("/books")
	BookList getBookList(); 
	@GetMapping("/book/{id}")
	Book getBook(@PathVariable("id")int id);
}
