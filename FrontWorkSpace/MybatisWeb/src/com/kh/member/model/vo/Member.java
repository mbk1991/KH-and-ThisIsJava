package com.kh.member.model.vo;

import java.sql.Date;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int memberAge;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	private String memberGender;
	private String memberHobby;
	private Date enrollDate;
	
	public Member() {}
	
	public Member(String memberId, String memberPwd, String memberName, int memberAge, String memberEmail,
			String memberPhone, String memberAddress, String memberGender, String memberHobby, Date enrollDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberGender = memberGender;
		this.memberHobby = memberHobby;
		this.enrollDate = enrollDate;
	}
	

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberAge=" + memberAge + ", memberEmail=" + memberEmail + ", memberPhone=" + memberPhone
				+ ", memberAddress=" + memberAddress + ", memberGender=" + memberGender + ", memberHobby=" + memberHobby
				+ ", enrollDate=" + enrollDate + "]";
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


	public int getMemberAge() {
		return memberAge;
	}


	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}


	public String getMemberEmail() {
		return memberEmail;
	}


	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}


	public String getMemberPhone() {
		return memberPhone;
	}


	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}


	public String getMemberAddress() {
		return memberAddress;
	}


	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}


	public String getMemberGender() {
		return memberGender;
	}


	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}


	public String getMemberHobby() {
		return memberHobby;
	}


	public void setMemberHobby(String memberHobby) {
		this.memberHobby = memberHobby;
	}


	public Date getEnrollDate() {
		return enrollDate;
	}


	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	
	

	
}
