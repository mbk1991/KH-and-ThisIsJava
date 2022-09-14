package com.kh.summernote.summer.domain;

public class TestTable {

	private int boardNo;
	private String boardTitle;
	private String boardContents;
	
	public TestTable() {}
	
	public TestTable(int boardNo, String boardTitle, String boardContents) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContents = boardContents;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}
	
	
	@Override
	public String toString() {
		return "TestTable [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContents=" + boardContents
				+ "]";
	}
	
}
