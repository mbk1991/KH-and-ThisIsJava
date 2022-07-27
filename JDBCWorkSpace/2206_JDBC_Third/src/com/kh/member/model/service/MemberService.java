package com.kh.member.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.member.common.JDBCTemplate;
import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;

public class MemberService {
	private JDBCTemplate jdbcTemplate;
	private MemberDAO mDao;
	ArrayList<Member> mList = null;
	
	public MemberService() {
		jdbcTemplate = JDBCTemplate.getInstance();
		mDao = new MemberDAO();
	}
	
	public ArrayList<Member> printAllService(){
		Connection conn = jdbcTemplate.createConnection();
		mList = mDao.memberSelectAllDB(conn);
		jdbcTemplate.close();
		return mList;
	}

	public ArrayList<Member> printByIdService(String inputId) {
		Connection conn = jdbcTemplate.createConnection();
		mList = mDao.memberSelectByIdDB(inputId,conn);
		jdbcTemplate.close();
		return mList;
	}

	public ArrayList<Member> printByNameService(String inputName) {
		Connection conn = jdbcTemplate.createConnection();
		mList = mDao.memberSelectByNameDB(inputName, conn);
		jdbcTemplate.close();
		
		return mList;
	}

	public int insertMemberService(Member member) {
		Connection conn = jdbcTemplate.createConnection();
		int result = mDao.memberInsertDB(member, conn);
		jdbcTemplate.close();
		return result;
	}	

	public int updateMemberService(Member member) {
		Connection conn = jdbcTemplate.createConnection();
		int result = mDao.memberUpdateDB(member, conn);
		jdbcTemplate.close();
		return result;
	}

	public int deleteMemberService(String inputIdForDelete) {
		Connection conn = jdbcTemplate.createConnection();
		int result = mDao.memberDeleteDB(inputIdForDelete, conn);
		jdbcTemplate.close();
		return result;
	}

	public int checkMemberIdService(String inputIdForUpdate) {
		Connection conn = jdbcTemplate.createConnection();
		int result = mDao.memberIdCheckDB(inputIdForUpdate, conn);
		jdbcTemplate.close();
		return result;
	}

	public String checkMemberPwdService(String inputIdForDelete) {
		Connection conn = jdbcTemplate.createConnection();
		String dbPwd = mDao.memberPwdCheckDB(inputIdForDelete, conn);
		jdbcTemplate.close();
		return dbPwd;
	}
	
}
