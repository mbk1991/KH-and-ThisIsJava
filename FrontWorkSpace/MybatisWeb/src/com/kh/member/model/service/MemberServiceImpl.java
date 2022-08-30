package com.kh.member.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.common.SqlSessionTemplate;
import com.kh.member.model.store.MemberStoreLogic;
import com.kh.member.model.vo.Member;

public class MemberServiceImpl implements MemberService {

	@Override
	public Member printMemberById(String memberId) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Member member = new MemberStoreLogic().printMemberById(session,memberId);
		session.close();
		return member;
	}

	@Override
	public Member printMemberLogin(String memberId, String memberPwd) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Member member = new MemberStoreLogic().printMemberLogin(session, memberId, memberPwd);
		return member;
	}

	@Override
	public ArrayList<Member> printMemberList() {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		ArrayList<Member> mList = new MemberStoreLogic().printMemberList(session);
		return mList;
	}

	@Override
	public int registerMember(Member member) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberStoreLogic().registerMember(session,member);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		
		return result;
	}

	@Override
	public int updateMember(Member member) {
		SqlSession session=SqlSessionTemplate.getSqlSession();
		int result = new MemberStoreLogic().updateMember(session,member);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		session.close();
		return result;
	}

	@Override
	public int deleteMember(String memberId) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberStoreLogic().deleteMember(session, memberId);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}
}
