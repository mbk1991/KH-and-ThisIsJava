package com.tistory.mabb.member.service;

import com.tistory.mabb.member.domain.Member;

public interface MemberService {
	public int registMember(Member member);
	public Member loginMember(Member member);
	public Member printOneById(String memberId);
	public int modifyMember(Member member);
	public int removeMember(String memberId);
}
