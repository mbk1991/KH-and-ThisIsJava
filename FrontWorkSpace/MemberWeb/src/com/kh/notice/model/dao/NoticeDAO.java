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
		String sql = "SELECT * FROM NOTICE_TBL";
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			nList = new ArrayList<Notice>();
			while(rset.next()) {
				Notice notice = new Notice();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				JDBCTemplate.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return nList;
	}
}
