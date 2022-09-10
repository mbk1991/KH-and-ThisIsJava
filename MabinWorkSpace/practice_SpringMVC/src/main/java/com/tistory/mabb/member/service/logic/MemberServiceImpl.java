package com.tistory.mabb.member.service.logic;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tistory.mabb.member.domain.Member;
import com.tistory.mabb.member.service.MemberService;
import com.tistory.mabb.member.store.MemberStore;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberStore mStore;
	@Autowired
	private SqlSessionTemplate session;

	@Override
	public Member loginMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registerMember(Member member) {
		int result = mStore.insertMember(session, member);
		return result;
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

}
