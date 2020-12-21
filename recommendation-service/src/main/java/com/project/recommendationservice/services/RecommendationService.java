package com.project.recommendationservice.services;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.recommendationservice.clients.BookClient;
import com.project.recommendationservice.clients.MovieClient;
import com.project.recommendationservice.models.Book;
import com.project.recommendationservice.models.BookList;
import com.project.recommendationservice.models.Movie;
import com.project.recommendationservice.models.MovieList;
public class RecommendationService {

	@Autowired
    BookClient bookClient;
    @Autowired
    MovieClient movieClient;
	@Autowired
	private RestTemplate restTemplate;
    public Book getRandomBook(){
    	List<Book> bookList = bookClient.getBookList();
    	Random rand = new Random();
        Book randomBook = bookList.get(rand.nextInt(bookList.size()));
    	return randomBook;
    	
    }
    public Movie getRandomMovie(){
    	MovieList movieList = movieClient.getMovieList();
    	List<Movie> movie=movieList.getMovies();
    	Random rand = new Random();
        Movie randomMovie = movie.get(rand.nextInt(movie.size()));
    	return randomMovie;
    	 
    }

}
