package com.project.movieservice.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.movieservice.models.Movie;
import com.project.movieservice.models.MovieList;
import com.project.movieservice.services.MovieService;

@RestController
public class MovieController {
	@GetMapping("/movies")
	public ResponseEntity<MovieList> getMovieList(){ 
		 MovieList movieList=new MovieList();
		 movieList.setMovies(MovieService.getMovieList());
	     return ResponseEntity.ok(movieList);    
	}
	@RequestMapping("/movies/{id}")
	public Movie getMovieById(@PathVariable("id") String id) {
		Movie m= MovieService.getMovieList().stream().filter(movie->id.equals(movie.getId())).findAny().orElse(null);
		return m;
	}
}
