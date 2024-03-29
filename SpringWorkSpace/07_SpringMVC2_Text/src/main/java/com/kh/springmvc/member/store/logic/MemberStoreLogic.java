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
	public Member selectOneById(SqlSession session, String memberId) {
		Member member = session.selectOne("MemberMapper.selectOneById",memberId);
		return member;
	}

	@Override
	public int insertMember(SqlSession session, Member member) {
		int result= session.insert("MemberMapper.insertMember",member);
		return result; // 커밋 롤백 자동
	}

	@Override
	public int updateMember(SqlSession session, Member member) {
		int result = session.update("MemberMapper.updateMember", member);
		return result;
	}

	@Override
	public int deleteMember(SqlSession session, String memberId) {
//		int result = session.delete("MemberMapper.deleteMember", memberId);
		System.out.println("storeLogic동작확인");
		int result = session.update("MemberMapper.deleteMember", memberId);
		System.out.println("storeLogic 쿼리 후 동작확인");
		return result;
	}

}
