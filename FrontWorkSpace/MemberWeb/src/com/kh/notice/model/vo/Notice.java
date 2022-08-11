package com.kh.notice.model.vo;

import java.sql.Date;

public class Notice {

	private int noticeNo;
	private String subject;
	private String contents;
	private String memberId;
	private Date regDate;

	public Notice() {
	}
	
	public Notice(String subject, String contents) {
		this.subject = subject;
		this.contents = contents;
	}

	public Notice(int noticeNo, String subject, String contents, String memberId, Date regDate) {
		super();
		this.noticeNo = noticeNo;
		this.subject = subject;
		this.contents = contents;
		this.memberId = memberId;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", subject=" + subject + ", contents=" + contents + ", memberId="
				+ memberId + ", regDate=" + regDate + "]";
	}
	
	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
