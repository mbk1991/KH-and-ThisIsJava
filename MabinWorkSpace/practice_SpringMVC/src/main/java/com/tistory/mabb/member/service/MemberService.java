package com.tistory.mabb.member.service;

import com.tistory.mabb.member.domain.Member;

public interface MemberService {
	//loginMember
	public Member loginMember(Member member);
	//registerMember
	public int registerMember(Member member);
	//modifyMember
	public int modifyMember(Member member);
	//removeMember
	public int removeMember(String memberId);
}
