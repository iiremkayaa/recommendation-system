package com.project.movieservice.services;

import java.util.Arrays;
import java.util.List;

import com.project.movieservice.models.Movie;

public class MovieService {
	private static List<Movie> movieList = Arrays.asList(
			new Movie(1,"Matrix","8.7"),
			new Movie(2,"Leon","8.5")
			);
	public static List<Movie> getMovieList() {
	        return movieList;
	}
}
