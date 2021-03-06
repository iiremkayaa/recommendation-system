package com.project.recommendationservice.models;

import lombok.Getter;
import lombok.Setter;

public class Book {
	 @Getter @Setter private int id; 
	 @Getter @Setter private String name;
	 @Getter @Setter private String author;
	 public Book() {

	 }
	 public Book(int id, String name, String author) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
	 }
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	 
}
