package com.kh.springmvc.board.domain;

import java.sql.Date;

public class Board {
	
	private int boardNo;
	private String boardTitle;
	private String boardContents;
	private String boardWriter;
	private String boardFileName;
	private String boardFileReName;
	private String boardFilePath;
	private String boardCount;
    private Date createDate;
	private Date updateDate;
	private String bStatus;
	
	public Board() {}

	public Board(int boardNo, String boardTitle, String boardContents, String boardWriter, String boardFileName,
			String boardFileReName, String boardFilePath, String boardCount, Date createDate, Date updateDate,
			String bStatus) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContents = boardContents;
		this.boardWriter = boardWriter;
		this.boardFileName = boardFileName;
		this.boardFileReName = boardFileReName;
		this.boardFilePath = boardFilePath;
		this.boardCount = boardCount;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.bStatus = bStatus;
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

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardFileName() {
		return boardFileName;
	}

	public void setBoardFileName(String boardFileName) {
		this.boardFileName = boardFileName;
	}

	public String getBoardFileReName() {
		return boardFileReName;
	}

	public void setBoardFileReName(String boardFileReName) {
		this.boardFileReName = boardFileReName;
	}

	public String getBoardFilePath() {
		return boardFilePath;
	}

	public void setBoardFilePath(String boardFilePath) {
		this.boardFilePath = boardFilePath;
	}

	public String getBoardCount() {
		return boardCount;
	}

	public void setBoardCount(String boardCount) {
		this.boardCount = boardCount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getbStatus() {
		return bStatus;
	}

	public void setbStatus(String bStatus) {
		this.bStatus = bStatus;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContents=" + boardContents
				+ ", boardWriter=" + boardWriter + ", boardFileName=" + boardFileName + ", boardFileReName="
				+ boardFileReName + ", boardFilePath=" + boardFilePath + ", boardCount=" + boardCount + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", bStatus=" + bStatus + "]";
	}
}

