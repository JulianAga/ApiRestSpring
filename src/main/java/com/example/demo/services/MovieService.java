package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Movie;
import com.example.demo.repositories.IMovieDao;

@Service
public class MovieService {

	@Autowired
	private IMovieDao iMovieDao;
	
	@Transactional(readOnly = true)
	public List<Movie> findAll()
	{
		return (List<Movie>) iMovieDao.findAll();
	}
	
	@Transactional
	public void save(Movie movie)
	{
		iMovieDao.save(movie);
	}
	
	@Transactional(readOnly = true)
	public Movie findOne(Long id)
	{
		return iMovieDao.findById(id).orElse(null);
	}
	
	@Transactional
	public void delete(Long id)
	{
		iMovieDao.deleteById(id);
	}
}
