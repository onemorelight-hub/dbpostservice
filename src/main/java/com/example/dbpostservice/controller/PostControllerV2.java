package com.example.dbpostservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbpostservice.dal.PostDalImpl;
import com.example.dbpostservice.model.Post;

@RestController
@RequestMapping (value = "/post/v2")
public class PostControllerV2 {

	@Autowired
	private PostDalImpl postDalImple;
	
	@GetMapping (value = "/getall")
	public List<Post> getAllDalPost(){
		return postDalImple.getAllPost();
	}
	
	@PostMapping (value = "/search/tags")
	public List<Post> getByTagsDal(@RequestBody List<String> tags){
		return postDalImple.getPostByTag(tags);
	}
	
	@PostMapping (value ="/search/post")
	public List<Post> getBySearch(@RequestBody String content){
		return postDalImple.getBySearch(content);
	}
}
