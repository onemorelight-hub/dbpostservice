package com.example.dbpostservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comment {
	private int id;
	private String userid;
	private String data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
