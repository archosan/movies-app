package com.movieapi.moviess.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapi.moviess.models.Movie;
import com.movieapi.moviess.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private  MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(String id) {
        return movieRepository.findByImdbId(id);
    }


}
