package com.project.recommendationservice.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.recommendationservice.models.Movie;
import com.project.recommendationservice.models.MovieList;

@FeignClient("movie-service")
public interface MovieClient {
	@GetMapping("/movies")
	MovieList getMovieList(); 
}