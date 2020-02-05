package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Movie;
@Repository
public interface IMovieDao extends CrudRepository<Movie, Long>{

}
