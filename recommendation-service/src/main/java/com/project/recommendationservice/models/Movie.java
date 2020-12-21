package com.project.recommendationservice.models;

import lombok.Getter;
import lombok.Setter;

public class Movie {
	@Getter @Setter private int id; 
	 @Getter @Setter private String name;
	 @Getter @Setter private String imdb;
	 public Movie() {

	 }
	 public Movie(int id, String name, String imdb) {
			super();
			this.id = id;
			this.name = name;
			this.imdb = imdb;
	 }
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", imdb=" + imdb + "]";
	}
	 
}
