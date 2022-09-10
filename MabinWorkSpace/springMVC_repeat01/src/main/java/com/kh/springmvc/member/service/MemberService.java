package com.kh.springmvc.member.service;

import com.kh.springmvc.member.domain.Member;

public interface MemberService {
	//CRUD
	public int registMember(Member member);
	public Member printOneMember(Member member);
	public int modifyMember(Member member);
	public int removeMember(String memberId);
	//LOGIN
	public Member memberLogin(Member member);
}
