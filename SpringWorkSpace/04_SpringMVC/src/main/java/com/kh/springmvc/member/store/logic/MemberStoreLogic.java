package com.kh.springmvc.member.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kh.springmvc.member.domain.Member;
import com.kh.springmvc.member.store.MemberStore;

@Repository
public class MemberStoreLogic implements MemberStore{

	@Override
	public Member selectLoginMember(SqlSession session, Member member) {
		Member mOne = session.selectOne("MemberMapper.selectLoginOne",member);
		return mOne;
	}

	@Override
	public int insertMember(SqlSession session, Member member) {
		int result= session.insert("MemberMapper.insertMember",member);
		return result; // 커밋 롤백 자동
	}

	@Override
	public int updateMember(SqlSession session, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(SqlSession session, String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
