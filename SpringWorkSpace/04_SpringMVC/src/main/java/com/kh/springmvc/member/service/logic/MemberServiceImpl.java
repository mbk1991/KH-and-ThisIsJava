package com.kh.springmvc.member.service.logic;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.springmvc.member.domain.Member;
import com.kh.springmvc.member.service.MemberService;
import com.kh.springmvc.member.store.MemberStore;
import com.kh.springmvc.member.store.logic.MemberStoreLogic;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private SqlSessionTemplate session;
	@Autowired
	private MemberStore mStore;

	@Override
	public Member loginMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registerMember(Member member) {

		int result = mStore.insertMember(session,member);
		return result;
	}

	@Override
	public int modyfyMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeMember(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
