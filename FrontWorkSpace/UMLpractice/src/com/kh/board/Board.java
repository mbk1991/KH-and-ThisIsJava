package com.kh.board;

import java.util.List;

import com.kh.comment.Comment;

public class Board implements OpenCloseable{
	private String title;
	private String contents;
	private List<Comment> comments;
	
	@Override
	public void open() {
	}
	@Override
	public void close() {
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void addComment(Comment comment) {
		
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	public List<Comment> getComments(){
		return comments;
	}
	
}
