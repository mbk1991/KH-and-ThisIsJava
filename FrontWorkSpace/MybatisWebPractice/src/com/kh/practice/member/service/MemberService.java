package com.kh.practice.member.service;

import java.util.ArrayList;

import com.kh.practice.member.vo.Member;

public interface MemberService {
	
	//CRUD 기능만 먼저 해보자.
	//selectOneMember , insert, update, delete
	
	public int insertMember(Member member);
	public Member selectOneMember(int memberId);
	public ArrayList<Member> selectMemberList();
	public Member loginCheck();
	public int deleteMember();
	public int updateMember();
	

}
