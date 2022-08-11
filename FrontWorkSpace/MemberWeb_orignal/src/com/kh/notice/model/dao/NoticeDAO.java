package com.kh.notice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.notice.model.vo.Notice;

public class NoticeDAO {

	public int insertNotice(Notice notice, Connection conn) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO NOTICE_TBL VALUES(SEQ_NOTICENO.NEXTVAL, ?, ?, ?, DEFAULT)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, notice.getSubject());
			pstmt.setString(2, notice.getContents());
			pstmt.setString(3, notice.getMemberId());
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

	public ArrayList<Notice> selectAllList(Connection conn, int currentPage) {
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM(SELECT ROW_NUMBER() OVER(ORDER BY NOTICE_NO DESC) AS NUM, NOTICE_TBL.* FROM NOTICE_TBL) WHERE NUM BETWEEN ? AND ?";
		ArrayList<Notice> nList = new ArrayList<Notice>();
		int recordCountPerPage = 5;
		int start = currentPage*recordCountPerPage - (recordCountPerPage - 1);
		// 1 -> 1, 2 -> 6, 3 -> 11
		int end = currentPage*recordCountPerPage;
		// 1 -> 5, 2 -> 10, 3 -> 15
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
//			stmt = conn.createStatement();
//			rset = stmt.executeQuery(query);
			while(rset.next()) {
				Notice notice = new Notice();
				notice.setNoticeNo(rset.getInt("NOTICE_NO"));
				notice.setSubject(rset.getString("SUBJECT"));
				notice.setContents(rset.getString("CONTENTS"));
				notice.setMemberId(rset.getString("MEMBER_ID"));
				notice.setRegDate(rset.getDate("REG_DATE"));
				nList.add(notice);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				rset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return nList;
	}
	
	public String getPageNavi(Connection conn, int currentPage) {
		// noticeList.jsp에 들어갈 페이지 넘버 스트링을 만들어주는 메소드
		// 만들 때에 전체 게시물의 갯수가 필요함.
		int recordTotalCount = this.totalCount(conn);	// 게시물의 전체 갯수
		int recordCountPerPage = 5;		// 한 페이지당 보여주는 게시물의 갯수
		// 게시물의 전체 갯수가 28개이고 한 페이지당 보여주는 게시물의 갯수가 5개이면
		// 페이지의 갯수는 몇개여야 하는가?
		// 28/10 = 2 + 1 -> 3
		// 28/5 = 5 + 1 -> 6
		// 25/5 = 5 
		
		//currntPage : 현재 페이지 -> 게시글 넘버
		//pageNaviTotalCount : 네비게이션에 표시할 갯수 -> 전체 페이지를 한 페이지에 표시할 갯수로 나눈 몫 + 1
		//recordCountPerPage :한 페이지에 표시할 게시물 갯수 -> 개발자 임의 선택
		//recordTotalCount : 전체 게시물의 갯수 -> 메소드를 통해 구한다.
		
		
		int pageNaviTotalcount = 0;
		if(recordTotalCount % recordCountPerPage != 0) {
			pageNaviTotalcount = recordTotalCount / recordCountPerPage + 1;
		}else {
			pageNaviTotalcount = recordTotalCount / recordCountPerPage;
		}
		
		if(currentPage < 1) {
			currentPage = 1;
		}else if(currentPage > pageNaviTotalcount) {
			currentPage = pageNaviTotalcount;
		}
		// 1 2 3 4 5 6
		// 1 2 3 4 5 [다음], [이전] 6 7 8 9 10 [다음], [이전] 11 12 13
		// 1 ~ 2
		// 1 2
		int pageNaviCountPerPage = 5; 	// 한 페이지에서 나오는 최대 페이지의 갯수
		int startNavi = ((currentPage-1)/pageNaviCountPerPage) * pageNaviCountPerPage + 1;
		int endNavi = startNavi+pageNaviCountPerPage-1;
		
		if(endNavi > pageNaviTotalcount) {
			endNavi = pageNaviTotalcount;
		}
		boolean needPrev = true;
		boolean needNext = true;
		if(startNavi == 1) {
			needPrev = false;
		}
		if(endNavi == pageNaviTotalcount) {
			needNext = false;
		}
		StringBuilder sb = new StringBuilder();
		if(needPrev) {
			sb.append("<a href='/notice/list.do?currentPage="+(startNavi-1)+"'>[이전] </a>");
		}
		for(int i = startNavi; i <= endNavi; i++) {
			sb.append("<a href='/notice/list.do?currentPage="+i+"'>"+i+" </a>");
		}
		if(needNext) {
			sb.append("<a href='/notice/list.do?currentPage="+(endNavi+1)+"'>[다음]</a>");
		}
		//<a href="/notice/list.do?currentPage=1">1</a> <a href="/notice/list.do?currentPage=2">2</a> <a href="/notice/list.do?currentPage=3">3</a> <a href="/notice/list.do?currentPage=4">4</a> <a href="/notice/list.do?currentPage=5">5</a> <a href="/notice/list.do?currentPage=">다음</a>
		return sb.toString();
	}
	// 게시물의 전체 갯수를 가져오는 메소드, JDBC 코딩 작성
	public int totalCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECt COUNT(*) AS TOTALCOUNT FROM NOTICE_TBL";
		int result = 0;
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				result = rset.getInt("TOTALCOUNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public Notice selectOneByNo(int noticeNo, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM NOTICE_TBL WHERE NOTICE_NO = ?";
		Notice notice = new Notice();
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			rset = pstmt.executeQuery();
			if(rset.next()) {
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
		return notice;	// return null로 두지 않아요
	}

	public int deleteNotice(int noticeNo, Connection conn) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM NOTICE_TBL WHERE NOTICE_NO = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
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
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE NOTICE_TBL SET SUBJECT = ?, CONTENTS = ? WHERE NOTICE_NO = ?";
		try {
			pstmt = conn.prepareStatement(query);
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
