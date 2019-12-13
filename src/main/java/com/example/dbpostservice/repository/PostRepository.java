package com.example.dbpostservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.dbpostservice.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Integer>{

	public List<Post> findByTagsIn(List<String> tags);
}
