package com.kh.member.model.store;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.member.model.vo.Member;

public interface MemberStore {
	
	public Member printMemberById(SqlSession session,String memberId);
	public int printMemberLogin(SqlSession session,String memberId, String memberPwd);
	public ArrayList<Member> printMemberList(SqlSession session);
	public int registerMember(SqlSession session, Member member);
	public int updateMember(SqlSession session, Member member);
	public int deleteMember(SqlSession session, String memberId);

}
