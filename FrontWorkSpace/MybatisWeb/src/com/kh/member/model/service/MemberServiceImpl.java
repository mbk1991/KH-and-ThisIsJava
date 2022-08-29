package com.kh.member.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.common.SqlSessionTemplate;
import com.kh.member.model.store.MemberStoreLogic;
import com.kh.member.model.vo.Member;

public class MemberServiceImpl implements MemberService {

	@Override
	public Member printMemberById(String memberId) {
		return null;
	}

	@Override
	public Member printMemberLogin(String memberId, String memberPwd) {
		return null;
	}

	@Override
	public ArrayList<Member> printMemberList() {
		return null;
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
		return 0;
	}

	@Override
	public int deleteMember(String memberId) {
		return 0;
	}

}
