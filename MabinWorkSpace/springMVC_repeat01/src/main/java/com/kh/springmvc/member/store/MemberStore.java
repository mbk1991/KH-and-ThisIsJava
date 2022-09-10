package com.kh.springmvc.member.store;

import org.apache.ibatis.session.SqlSession;

import com.kh.springmvc.member.domain.Member;

public interface MemberStore {
	//CRUD
	public int insertMember(SqlSession session,Member member);
	public Member selectOneMember(SqlSession session,Member member);
	public int updateMember(SqlSession session,Member member);
	public int deleteMember(SqlSession session,String memberId);
	//LOGIN
	public Member memberLogin(SqlSession session,Member member);
}
