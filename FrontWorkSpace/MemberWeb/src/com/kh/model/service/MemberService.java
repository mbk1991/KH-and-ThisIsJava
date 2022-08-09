package com.kh.model.service;

import java.sql.Connection;
import java.sql.SQLException;
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
		Connection conn;
		int result = 0;
		try {
			conn = jdbcTemplate.createConnection();
			result = mDao.insertMember(member,conn);
			if(result > 0) {
				JDBCTemplate.commit();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int memberOneCheck(String memberId, String memberPwd) {
		Connection conn;
		int isMember = 0;
		try {
			conn = jdbcTemplate.createConnection();
			isMember = mDao.selectOneMember(memberId,memberPwd,conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback();
		}
		return isMember;
	}

	public ArrayList<Member> selectAllMember() {
		Connection conn;
		ArrayList<Member> mList = null;
		try {
			conn = jdbcTemplate.createConnection();
			mList = mDao.selectAllmember(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close();
		}
		return mList;
	}

	public Member selectMyInfo(String memberId) {
		Connection conn;
		Member member = null;
		try {
			conn = jdbcTemplate.createConnection();
			member = mDao.myInfoSelect(memberId,conn);
			if(member!=null) {
				JDBCTemplate.commit();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback();
		} finally {
			JDBCTemplate.close();
		}
		return member;
	}
}
