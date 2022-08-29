package com.kh.member.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.kh.member.model.vo.Member;

public interface MemberService {

	public Member printMemberById(String memberId);
	public Member printMemberLogin(String memberId, String memberPwd);
	public ArrayList<Member> printMemberList();
	public int registerMember(Member member);
	public int updateMember( Member member);
	public int deleteMember(String memberId);
	
}
