package com.movieapi.moviess.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.movieapi.moviess.models.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    
    Optional <Movie> findByImdbId(String imdbId);
}
