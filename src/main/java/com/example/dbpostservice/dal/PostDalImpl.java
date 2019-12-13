package com.example.dbpostservice.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.dbpostservice.model.Post;

@Repository
public class PostDalImpl implements PostDal {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	@Override
	public List<Post> getAllPost() {
		return mongoTemplate.findAll(Post.class);
	}

	@Override
	public List<Post> getPostByTag(List<String> tags) {
		Query query = new Query();
		BasicQuery basicQuery = new BasicQuery("{tags : 'java'}");
		query.addCriteria(Criteria.where("tags").is(tags));
		
		return mongoTemplate.find(basicQuery, Post.class);
	}

	@Override
	public List<Post> getPostByUser(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userid").is(userId));
		return mongoTemplate.find(query, Post.class);
	}

	@Override
	public List<Post> getPostByTitle(String title) {
		Query query = new Query();
		query.addCriteria(Criteria.where("title").is(title));
		return mongoTemplate.find(query,Post.class);
	}

	@Override
	public List<Post> getBySearch(String content) {
		Query query = new Query();
		query.addCriteria(Criteria.where("description").regex(content,"i"));
		//return mongoTemplate.find(Query.query(new Criteria().orOperator(Criteria.where("description").regex(content,"i"))), Post.class);
		return mongoTemplate.find(query, Post.class);
	}
}
