package com.example.dbpostservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbpostservice.model.Post;
import com.example.dbpostservice.repository.PostRepository;


@RestController
@RequestMapping (value = "/post/v1")
public class PostControllerV1 {

	@Autowired
	private PostRepository postRepository;
	
	@GetMapping (value = "/getall")
	public List<Post> getAllPost(){
		return postRepository.findAll();
	}
	
	@PostMapping (value = "/newpost")
	public void insertPost(@RequestBody Post post) {
		postRepository.save(post);
	}
	
	@PostMapping (value = "/search/tags")
	public List<Post> getByTags(@RequestBody List<String> tags){
		
		return postRepository.findByTagsIn(tags);
	}
}
