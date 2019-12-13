package com.example.dbpostservice.model;

import java.util.LinkedList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Page {
	private int id;
	private List<Block> blocks = new LinkedList<Block>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Block> getBlocks() {
		return blocks;
	}
	public void setBlocks(List<Block> blocks) {
		this.blocks = blocks;
	}
	
	/**
	 * this method a new block into page
	 * @param block
	 */
	public void addBlock(Block block) {
		blocks.add(block);
	}
	/**
	 * This method used to add n no. of blocks 
	 * @param blocks
	 */
	public void addBlocks(List<Block> blocks) {
		blocks.addAll(blocks);
	}
	/**
	 * this method used to delete a block from a page
	 * @param block
	 */
	public void deleteBlock(Block block) {
		blocks.remove(block);
	}
	/**
	 * This method used to add n no. of blocks 
	 * @param blocks
	 */
	public void deleteBlocks(List<Block> blocks) {
		blocks.removeAll(blocks);
	}
}
