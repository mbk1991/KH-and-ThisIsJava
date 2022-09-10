package com.tistory.mabb.member.store;

import com.tistory.mabb.member.domain.Member;

public interface MemberStore {
	public int insertMember(Member member);
	public Member selectLoginMember(Member member);
	public Member selectOneMember(String memberId);
	public int updateMember(Member member);
	public int deleteMember(String memberId);
	
}
