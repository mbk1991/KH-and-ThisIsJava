package com.kh.member.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;

public class MemberService {
	ArrayList<Member> mList = null;
	JDBCTemplate jdbcTemplate = JDBCTemplate.getInstance();
	MemberDAO mDao = new MemberDAO();	
	int result;
	

	public ArrayList<Member> memberSelectAllService() {
		Connection conn = jdbcTemplate.createConnection();
		mList = mDao.memberSelectAllDB(conn);
		return mList;
	}

	public ArrayList<Member> memberSelectByIdService(String inputId) {
		Connection conn = jdbcTemplate.createConnection();
		mList = mDao.memberSelectByIdDB(inputId, conn);
		return mList;
	}

	public ArrayList<Member> memberSelectByNameService(String inputName) {
		Connection conn = jdbcTemplate.createConnection();
		mList =mDao.memberSelectByNameDB(inputName, conn);
		return mList;
	}

	public int memberInsertService(Member member) {
		Connection conn = jdbcTemplate.createConnection();
		result = mDao.memberInsertDB(member, conn);
		return result;
	}

	public int memberIdCheckService(String inputIdForUpdate) {
		Connection conn = jdbcTemplate.createConnection();
		result = mDao.memberIdCheckDB(inputIdForUpdate, conn);
		return result;
	}

	public int memberUpdateService(Member member) {
		Connection conn = jdbcTemplate.createConnection();
		result = mDao.memberUpdateDB(member, conn);
		return result;
	}

	public String memberPwdCheckSerivice(String inputIdForDelete) {
		Connection conn = jdbcTemplate.createConnection();
		String dbPwd = mDao.memberPwdCheckDB(inputIdForDelete, conn);
		return dbPwd;
	}

	public int memberDeleteService(String inputIdForDelete) {
		Connection conn = jdbcTemplate.createConnection();
		result = mDao.memberDeleteDB(inputIdForDelete, conn);
		return result;
	}

}
