package com.project.movieservice.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class MovieList {
	@Getter
	@Setter
	private List<Movie> movies;

	public MovieList(List<Movie> movies) {
		super();
		this.movies = movies;
	}

	public MovieList() {

	}
}
