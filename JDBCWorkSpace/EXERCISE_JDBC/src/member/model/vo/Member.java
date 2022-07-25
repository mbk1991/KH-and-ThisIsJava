package member.model.vo;

import java.sql.Date;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberSsn;
	private String memberAddress;
	private String memberPhone;
	private String memberEmail;
	private Date joinDate;

	public Member() {}
	
	public Member(String memberId, String memberPwd, String memberName, String memberSsn, String memberAddress,
			String memberPhone, String memberEmail, Date joinDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberSsn = memberSsn;
		this.memberAddress = memberAddress;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.joinDate = joinDate;
	}
	
	public Member(String memberId, String memberPwd, String memberName, String memberSsn, String memberAddress,
			String memberPhone, String memberEmail) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberSsn = memberSsn;
		this.memberAddress = memberAddress;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberSsn=" + memberSsn + ", memberAddress=" + memberAddress + ", memberPhone=" + memberPhone
				+ ", memberEmail=" + memberEmail + ", joinDate=" + joinDate + "]";
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

	public String getMemberSsn() {
		return memberSsn;
	}

	public void setMemberSsn(String memberSsn) {
		this.memberSsn = memberSsn;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

}
