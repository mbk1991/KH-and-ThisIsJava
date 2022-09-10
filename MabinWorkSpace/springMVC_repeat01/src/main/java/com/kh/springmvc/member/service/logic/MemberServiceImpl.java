package com.kh.springmvc.member.service.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.springmvc.member.domain.Member;
import com.kh.springmvc.member.service.MemberService;
import com.kh.springmvc.member.store.MemberStore;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private SqlSession session;
	@Autowired
	private MemberStore mStore;
	
	@Override
	public int registMember(Member member) {
		int result = mStore.insertMember(session, member);
		return result;
	}

	@Override
	public Member printOneMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeMember(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member memberLogin(Member member) {
		Member mOne = mStore.memberLogin(session, member);
		return mOne;
	}

}
