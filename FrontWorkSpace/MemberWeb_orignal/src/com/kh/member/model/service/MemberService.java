package com.kh.member.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;

public class MemberService {
	// 1. DB연결생성
	// 2. 커밋/롤백
	private JDBCTemplate jdbcTemplate;
	private MemberDAO mDao;
	public MemberService() {
		jdbcTemplate = JDBCTemplate.getInstance();
		mDao = new MemberDAO();
	}
	
	public int insertMember(Member member) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.createConnection();
			result = mDao.insertMember(member, conn);
			if(result > 0) {
				JDBCTemplate.commit();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback();
		} finally {
			JDBCTemplate.close();
		}
		
		return result;
	}
	// 로그인용 회원조회
	public int memberOneCheck(String memberId, String memberPwd) {
		Connection conn = null;
		int isMember = 0;
		try {
			conn = jdbcTemplate.createConnection();
			isMember = mDao.selectOneMember(memberId, memberPwd, conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close();
		}
		return isMember;
	}
	// 전체 회원조회
	public ArrayList<Member> selectAllMember() {
		Connection conn = null;
		ArrayList<Member> mList = null;
		try {
			conn = jdbcTemplate.createConnection();
			mList = mDao.selectAllMember(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close();
		}
		return mList;
	}

	public Member selectOneById(String memberId) {
		Connection conn = null;
		Member member = null;
		try {
			conn = jdbcTemplate.createConnection();
			member = mDao.selectOneById(memberId, conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close();
		}
		return member;
	}

	public int updateMember(Member member) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.createConnection();
			result = mDao.updateMember(member, conn);
			if(result > 0) {
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
		return result;
	}

	public int deleteMember(String memberId) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.createConnection();
			result = mDao.deleteMember(memberId, conn);
			if(result > 0) {
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
		return result;
	}
}









