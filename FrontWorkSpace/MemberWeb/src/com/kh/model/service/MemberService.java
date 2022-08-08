package com.kh.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.model.dao.MemberDAO;
import com.kh.model.vo.Member;

public class MemberService {
	private JDBCTemplate jdbcTemplate;
	private MemberDAO mDao;
	
	public MemberService() {
		jdbcTemplate = JDBCTemplate.getInstance();
		mDao = new MemberDAO();
	}
	
	public int insertMember(Member member) {
		Connection conn = jdbcTemplate.createConnection();
		int result = mDao.insertMember(member,conn);
		return result;
	}

	public int memberOneCheck(String memberId, String memberPwd) {
		Connection conn = jdbcTemplate.createConnection();
		int isMember = mDao.selectOneMember(memberId,memberPwd,conn);
		return isMember;
	}

	public ArrayList<Member> selectAllMember() {
		Connection conn = jdbcTemplate.createConnection();
		ArrayList<Member> mList = mDao.selectAllmember(conn);
		return mList;
	}
}
