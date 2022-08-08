package com.kh.member.model.vo;

import java.sql.Date;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String yyyy;
	private String  mm;
	private String dd;
	private String memberBirth;
	private String email;
	private String phone;
	private Date enrollDate;
	
	public Member() {}
	
	public Member(String memberId, String memberPwd, String memberName, String yyyy, String mm, String dd, String email,
			String phone) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.yyyy = yyyy;
		this.mm = mm;
		this.dd = dd;
		this.email = email;
		this.phone = phone;

	}
	public String getMemberBirth() {
		yyyy= getYyyy();
		mm=getMm();
		dd=getDd();
		
		memberBirth = yyyy+mm+dd;
		return memberBirth;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getYyyy() {
		return yyyy;
	}
	public void setYyyy(String yyyy) {
		this.yyyy = yyyy;
	}
	public String getMm() {
		return mm;
	}
	public void setMm(String mm) {
		this.mm = mm;
	}
	public String getDd() {
		return dd;
	}
	public void setDd(String dd) {
		this.dd = dd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	
	
}
