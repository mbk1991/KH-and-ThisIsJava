package com.kh.notice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.notice.model.vo.Notice;

public class NoticeDAO {
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rset;
	ArrayList<Notice> nList;

	public int insertNotice(Notice notice, Connection conn) {
		int result = 0;
		String sql = "INSERT INTO NOTICE_TBL VALUES(SEQ_NOTICENO.NEXTVAL,?,?,?,DEFAULT)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, notice.getSubject());
			pstmt.setString(2, notice.getContents());
			pstmt.setString(3, notice.getMemberId());
			result = pstmt.executeUpdate();
			if (result > 0) {
				JDBCTemplate.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback();
		} finally {
			try {
				pstmt.close();
				JDBCTemplate.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public ArrayList<Notice> selectAllNotice(Connection conn) {
		String sql = "SELECT * FROM NOTICE_TBL ORDER BY NOTICE_NO DESC";
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			nList = new ArrayList<Notice>();
			while (rset.next()) {
				Notice notice = new Notice();
				notice.setNoticeNo(rset.getInt("NOTICE_NO"));
				notice.setSubject(rset.getString("SUBJECT"));
				notice.setContents(rset.getString("CONTENTS"));
				notice.setMemberId(rset.getString("MEMBER_ID"));
				notice.setRegDate(rset.getDate("REG_DATE"));
				nList.add(notice);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return nList;
	}

	public Notice selectOneByNo(int noticeNo, Connection conn) {
		String sql = "SELECT * FROM NOTICE_TBL WHERE NOTICE_NO = ?";
		Notice notice = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, noticeNo);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				notice = new Notice();
				notice.setNoticeNo(rset.getInt("NOTICE_NO"));
				notice.setSubject(rset.getString("SUBJECT"));
				notice.setContents(rset.getString("CONTENTS"));
				notice.setMemberId(rset.getString("MEMBER_ID"));
				notice.setRegDate(rset.getDate("REG_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return notice;
	}

	public int deleteNotice(int noticeNo, Connection conn) {
		String sql = "DELETE FROM NOTICE_TBL WHERE NOTICE_NO = ?";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,noticeNo);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int updateNotice(Notice notice, Connection conn) {
		String sql = "UPDATE NOTICE_TBL SET SUBJECT = ?, CONTENTS = ? WHERE NOTICE_NO = ?";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, notice.getSubject());
			pstmt.setString(2, notice.getContents());
			pstmt.setInt(3, notice.getNoticeNo());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
