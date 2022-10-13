package com.kh.junspring.board.domain;

import java.sql.Date;

public class Reply {
	private int replyNo; //댓글 식별 번호
	private int refBoardNo; //부모 게시글 넘버
	private String replyContents; // 댓글 내용
	private String replyWriter; // 댓글 작성자
	private Date rCreateDate; // 댓글 작성 시각
	private Date rUpdateDate; // 댓글 수정 시각
	private String rStatus; // 댓글 상태
	
	public  Reply() {}
	
	
	public Reply(int replyNo, int refBoardNo, String replyContents, String replyWriter, Date rCreateDate,
			Date rUpdateDate, String rStatus) {
		super();
		this.replyNo = replyNo;
		this.refBoardNo = refBoardNo;
		this.replyContents = replyContents;
		this.replyWriter = replyWriter;
		this.rCreateDate = rCreateDate;
		this.rUpdateDate = rUpdateDate;
		this.rStatus = rStatus;
	}
	
	@Override
	public String toString() {
		return "Reply [replyNo=" + replyNo + ", refBoardNo=" + refBoardNo + ", replyContents=" + replyContents
				+ ", replyWriter=" + replyWriter + ", rCreateDate=" + rCreateDate + ", rUpdateDate=" + rUpdateDate
				+ ", rStatus=" + rStatus + "]";
	}
	public int getReplyNo() {
		return replyNo;
	}
	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}
	public int getRefBoardNo() {
		return refBoardNo;
	}
	public void setRefBoardNo(int refBoardNo) {
		this.refBoardNo = refBoardNo;
	}
	public String getReplyContents() {
		return replyContents;
	}
	public void setReplyContents(String replyContents) {
		this.replyContents = replyContents;
	}
	public String getReplyWriter() {
		return replyWriter;
	}
	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}
	public Date getrCreateDate() {
		return rCreateDate;
	}
	public void setrCreateDate(Date rCreateDate) {
		this.rCreateDate = rCreateDate;
	}
	public Date getrUpdateDate() {
		return rUpdateDate;
	}
	public void setrUpdateDate(Date rUpdateDate) {
		this.rUpdateDate = rUpdateDate;
	}
	public String getrStatus() {
		return rStatus;
	}
	public void setrStatus(String rStatus) {
		this.rStatus = rStatus;
	}
	
	
}
