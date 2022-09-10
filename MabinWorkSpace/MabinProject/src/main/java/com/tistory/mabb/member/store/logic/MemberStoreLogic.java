package com.tistory.mabb.member.store.logic;

import org.springframework.stereotype.Repository;

import com.tistory.mabb.member.domain.Member;
import com.tistory.mabb.member.store.MemberStore;

@Repository
public class MemberStoreLogic implements MemberStore{

	@Override
	public int insertMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member selectLoginMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectOneMember(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
