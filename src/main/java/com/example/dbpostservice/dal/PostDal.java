package com.example.dbpostservice.dal;

import java.util.List;

import com.example.dbpostservice.model.Post;

public interface PostDal {

	public List<Post> getAllPost();
	public List<Post> getPostByTag(List<String> tags);
	public List<Post> getPostByUser(String userId);
	public List<Post> getPostByTitle(String title);
	public List<Post> getBySearch(String content);
}
