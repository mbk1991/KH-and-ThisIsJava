package com.kh.springmvc.member.service;

import java.util.Map;

import com.kh.springmvc.member.domain.Member;

public interface MemberService {
	
	public Member loginMember(Member member);
	public Member printOneById(String memberId);
	public int registerMember(Member member);
	public int registerMember(Map<String,String>paramMap);
	public int modyfyMember(Member member);
	public int removeMember(String memberId);
}
