package com.kh.member.model.store;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.member.model.vo.Member;

public class MemberStoreLogic implements MemberStore {

	@Override
	public Member printMemberById(SqlSession session, String memberId) {
		Member member = session.selectOne("MemberMapper.selectOneMember",memberId);
		return member;
	}

	@Override
	public Member printMemberLogin(SqlSession session, String memberId, String memberPwd) {
		Member param = new Member();
		param.setMemberId(memberId);
		param.setMemberPwd(memberPwd);
		Member member = session.selectOne("MemberMapper.selectMemberLogin",param);
		return member;
	}

	@Override
	public ArrayList<Member> printMemberList(SqlSession session) {
		List<Member> mList = session.selectList("MemberMapper.selectAllMember");
		
		return (ArrayList<Member>)mList;
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
		int result = session.insert("MemberMapper.updateMember",member);
		return result;
	}

	@Override
	public int deleteMember(SqlSession session, String memberId) {
		int result = session.delete("MemberMapper.deleteMember", memberId);
		return result;
	}
}
