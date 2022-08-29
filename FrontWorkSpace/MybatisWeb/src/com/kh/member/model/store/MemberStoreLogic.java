package com.kh.member.model.store;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.member.model.vo.Member;

public class MemberStoreLogic implements MemberStore {

	@Override
	public Member printMemberById(SqlSession session, String memberId) {
		return null;
	}

	@Override
	public int printMemberLogin(SqlSession session, String memberId, String memberPwd) {
		return 0;
	}

	@Override
	public ArrayList<Member> printMemberList(SqlSession session) {
		return null;
	}

	@Override
	public int registerMember(SqlSession session, Member member) {
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberPhone());
		int result = session.insert("MemberMapper.insertMember",member);
		return result;
	}

	@Override
	public int updateMember(SqlSession session, Member member) {
		return 0;
	}

	@Override
	public int deleteMember(SqlSession session, String memberId) {
		return 0;
	}

}
