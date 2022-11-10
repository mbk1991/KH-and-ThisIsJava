package com.kh.junspring.member.service;

import java.util.Map;

import com.kh.junspring.member.domain.Member;

public interface MemberService {
	// loginMember
	public Member loginMember(Member member);
	// printOneById
	public Member printOneById(String memberId);
	// registerMember
	public int registerMember(Member member);
	public int registerMember(Map<String,String> paramMap);
	
	// modifyMember
	public int modifyMember(Member member);
	// removeMember
	public int removeMember(String memberId);
}
