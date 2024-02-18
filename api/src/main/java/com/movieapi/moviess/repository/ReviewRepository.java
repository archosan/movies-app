package com.movieapi.moviess.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.movieapi.moviess.models.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    
}
