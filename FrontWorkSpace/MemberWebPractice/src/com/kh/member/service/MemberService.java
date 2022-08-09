package com.kh.member.service;

import java.sql.Connection;

import com.kh.member.common.JDBCTemplate;
import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;

public class MemberService {
	Connection conn = null;
	JDBCTemplate jdbcTemplate = null;
	MemberDAO mDao = null;
	int result=3;
	
	public MemberService(){
		jdbcTemplate = JDBCTemplate.getInstance();
		mDao = new MemberDAO();
		
	}
	
	public int memberInsert(Member member) {
		conn =	jdbcTemplate.createConnection(); 
	
		result = mDao.memberInsertDB(member, conn);
		System.out.println("service result" + result);
		return result;
	}

}
