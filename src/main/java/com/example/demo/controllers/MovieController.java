package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Movie;
import com.example.demo.services.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping
	public void insert(@RequestBody Movie movie)
	{
		movieService.save(movie);
	}
	
	@GetMapping
	public List<Movie> getAll()
	{
		return movieService.findAll(); 
	}
	
	@PutMapping
	public void modify(@RequestBody Movie movie)
	{
		movieService.save(movie);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable Long id)
	{
		movieService.delete(id);
	}
	
}
