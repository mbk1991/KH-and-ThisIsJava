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

	public ArrayList<Notice> selectAllNotice(Connection conn ,int currentPage) {
		String sql = "SELECT * FROM (SELECT ROW_NUMBER() OVER(ORDER BY NOTICE_NO DESC) AS NUM, NOTICE_TBL.* FROM NOTICE_TBL) WHERE NUM BETWEEN ? AND ?";
		try {
			int recordCountPerPage = 5;
			int start = currentPage*recordCountPerPage - (recordCountPerPage-1);
			int end = start + 4;
//			int end = currentPage*recordCountPerPage;
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,start);
			pstmt.setInt(2,end);
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
	
	public String getPageNavi(Connection conn, int currentPage) {
		//noticeList.jsp에 들어갈 페이지 넘버 스트링을 만들어주는 메소드
		//만들 때에 전체 게시물의 갯수가 필요함.
		//전체 게시물의 갯수를 구하기 위해서 conn객체가 필요함.
		//여기에다가 jdbc코딩을 하면 길어짐. 전체 게시물의 갯수를 가져오는 메소드가 필요하다.
		int recordTotalCount = this.totalCount(conn); //게시물의 전체 갯수
		int recordCountPerPage = 5; //한페이지당 보여주는 게시물의 갯수
		//게시물의 전체 갯수가 28개이고 한 페이지당 보여주는 게시물의 갯수가 10개이면
		//페이지 갯수는 몇개여야 하는가? 3개
		// 28/10 = 2 +1 -> 3 (페이지의 갯수)
		int pageNaviTotalCount = 0;
		if(recordTotalCount % recordCountPerPage != 0) {
			pageNaviTotalCount = recordTotalCount / recordCountPerPage + 1;
		}else {
			pageNaviTotalCount = recordTotalCount / recordCountPerPage;
		}
		
		if(currentPage < 1) {
			currentPage = 1;
		}else if(currentPage > pageNaviTotalCount) {
			currentPage = pageNaviTotalCount;
		}
		//1 2 3 4 5 6
		//1 2 3 4 5 [다음], [이전] 6 이 기능 구현.
		int pagenaviCountPerPage = 5; // 한페이지에 나오는 최대 페이지의 갯수.
		
		return null;
	}
	
	//게시물의 전체 갯수를 가져오는 메소드
	public int totalCount(Connection conn) {
		//재사용을 위하여 따로 메소드를 만듦.
		String query = "SELECT COUNT(*) AS TOTALCUONT FROM NOTICE_TBL";
		int result = 0;
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				result = rset.getInt("TOTALCOUNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
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
