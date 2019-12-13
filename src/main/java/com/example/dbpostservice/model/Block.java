package com.example.dbpostservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Block {
	private int id;
	private String type;
	private String data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
