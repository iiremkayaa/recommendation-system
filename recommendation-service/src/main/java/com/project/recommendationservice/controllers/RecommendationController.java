package com.project.recommendationservice.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.recommendationservice.services.RecommendationService;


@RestController
public class RecommendationController {    

	@GetMapping(path= "/{type}", produces = "application/json")
	public ResponseEntity<String> getRecommendation(@PathVariable("type") String type) {
		RecommendationService service=new RecommendationService();
		switch (type) {
		case "movie":
			return ResponseEntity.ok().body(service.getRandomMovie().toString());
		case "book":
			return ResponseEntity.ok().body(service.getRandomBook().toString());
		default:
			return new ResponseEntity<>("Invalid type", HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
