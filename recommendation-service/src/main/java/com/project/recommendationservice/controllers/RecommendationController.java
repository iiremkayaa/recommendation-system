package com.project.recommendationservice.controllers;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.recommendationservice.clients.BookClient;
import com.project.recommendationservice.clients.MovieClient;
import com.project.recommendationservice.models.Book;
import com.project.recommendationservice.models.BookList;
import com.project.recommendationservice.models.Movie;
import com.project.recommendationservice.models.MovieList;


@RestController
@RequestMapping("/random")
public class RecommendationController {    
	@Autowired
    BookClient bookClient;
    @Autowired
    MovieClient movieClient;
    
    
    @RequestMapping(value="/movie",method=RequestMethod.GET)
    private ResponseEntity<Movie> getRandomMovie() {
    	Random rand = new Random();
    	MovieList movieList = movieClient.getMovieList();
    	List<Movie> movie=movieList.getMovies();
        Movie randomMovie = movie.get(rand.nextInt(movie.size()));
        return ResponseEntity.ok().body(randomMovie);
    }
    @RequestMapping(value="/book",method=RequestMethod.GET)
    private ResponseEntity<Book> getRandomBook() {
    	Random rand = new Random();
    	BookList books=bookClient.getBookList();
        Book randomBook = books.getBooks().get(rand.nextInt(books.getBooks().size()));
        return ResponseEntity.ok().body(randomBook);
    }

	
}
