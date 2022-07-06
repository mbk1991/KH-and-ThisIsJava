package com.kh.member.model.vo;

//데이터 저장용 클래스
public class Member {
	// 아이디, 비밀번호, 이름, 나이, 성별, 이메일
	// 전화번호, 주소, 취미

	private String memberId;
	private String memberPwd;
	private String memberName;
	private int memberAge;
	private String memberGender;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	private String memberHobby;

	public Member() {
	}

	public Member(String memberId, String memberPwd, String memberName, int memberAge, String memberGender,
			String memberEmail, String memberPhone, String memberAddress, String memberHobby) {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberGender = memberGender;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberHobby = memberHobby;
	}

	@Override
	public String toString() {

		String infoStr = "회원 아이디 : " + memberId + "\n회원 이름 : " + memberName + "\n회원 성별 : " + memberGender + "\n회원 나이 : "
				+ memberAge + "\n회원 이메일 : " + memberEmail + "\n회원 폰번호 : " + memberPhone + "\n회원 주소 : " + memberAddress
				+ "\n회원 취미 : " + memberHobby + "\n====================";

		return infoStr;
	}
	public String forFileStr() {
		String forFileStr = memberId+"/f/"+memberPwd+"/f/"+memberName+"/f/"+memberAge+"/f/"+memberGender+"/f/"+memberEmail+"/f/"+
						memberPhone+"/f/"+memberAddress+"/f/"+memberHobby+"/o/";
		return forFileStr;
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

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
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

	public String getMemberHobby() {
		return memberHobby;
	}

	public void setMemberHobby(String memberHobby) {
		this.memberHobby = memberHobby;
	}
}
