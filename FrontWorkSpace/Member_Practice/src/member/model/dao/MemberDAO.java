package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import member.model.common.JDBCTemplate;
import member.model.vo.Member;
import member.model.vo.Notice;
import member.model.vo.NoticePageData;

public class MemberDAO {

	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rset;
	ArrayList<Member> mList;

	public int memberInsertDB(Member member, Connection conn) {
		String sql = "INSERT INTO MEMBER_TABLE VALUES(?,?,?,?,?,DEFAULT)";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPwd());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberPhone());
			pstmt.setString(5, member.getMemberEmail());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
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

	public String loginCheckDB(String id, String pwd, Connection conn) {
		String sql = "SELECT ADMIN_CHECK FROM MEMBER_TABLE WHERE MEMBER_ID=? AND MEMBER_PWD=?";
		String adminCheck = "";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				adminCheck = rset.getString(1);
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
			} finally {
				try {
					rset.close();
					pstmt.close();
					JDBCTemplate.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return adminCheck;
	}

	public NoticePageData noticeAllSelectDb(int currentPage, Connection conn) {
		NoticePageData npd = new NoticePageData();
		ArrayList<Notice> nList = new ArrayList<>();
		String sql = "SELECT * FROM (SELECT ROW_NUMBER() OVER(ORDER BY REG_DATE DESC)AS NUM,NOTICE_TBL.* FROM NOTICE_TBL) WHERE NUM BETWEEN ? AND ?";
		int noticePerPage = 5;
		int endNum = currentPage * noticePerPage;
		int startNum = endNum - (noticePerPage - 1);

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,startNum);
			pstmt.setInt(2,endNum);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				Notice notice = new Notice(rset.getInt("NOTICE_NO"), rset.getString("SUBJECT"),
						rset.getString("CONTENTS"), rset.getString("MEMBER_ID"), rset.getDate("REG_DATE"));
				nList.add(notice);
			}

			String currentPageStr = this.getCurrentPage(currentPage, conn);

			npd.setnList(nList);
			npd.setCurrentPage(currentPageStr);

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
		return npd;
	}

	private String getCurrentPage(int currentPage, Connection conn) {
		StringBuilder sb = new StringBuilder();
		
		
		int pageNaviSize = 5;
		int totalPageCount = this.getTotalNoticeCount(conn);
		int pageNaviTotalCount = 0;
		if(totalPageCount % pageNaviSize == 0) {
			pageNaviTotalCount = totalPageCount / pageNaviSize;
		} else {
			pageNaviTotalCount = (totalPageCount / pageNaviSize) + 1;
		}
		
		
		if(currentPage < 1) {
			currentPage = 1;
		}
		if(currentPage > pageNaviTotalCount) {
			currentPage = pageNaviTotalCount;
		}
		
		
		int pageNaviStart = ((currentPage-1)/pageNaviSize) + 1;
		if(pageNaviStart < 1) {
			pageNaviStart = 1;
		}
		
		int pageNaviEnd = pageNaviStart + (pageNaviSize - 1);
		if(pageNaviEnd > pageNaviTotalCount) {
			pageNaviEnd = pageNaviTotalCount;
		}
		
		if(pageNaviStart > 1) {
			sb.append("<a href='/notice.do?currentPage="+(currentPage-1)+"'> << </a>");
		}
		for(int i=pageNaviStart; i <= pageNaviEnd; i++ ) {
			sb.append("<a href='/notice.do?currentPage="+i+"'> "+ i +" </a> ");
		}
		if(pageNaviEnd < pageNaviTotalCount) {
			sb.append("<a href='/notice.do?currentPage="+(currentPage+1)+"'> >> </a>");
		}
		

		return sb.toString();
	}

	private int getTotalNoticeCount(Connection conn) {
		String sql = "SELECT COUNT(*) AS TOTAL_NOTICE FROM NOTICE_TBL";
		int totalNoticeCount = 0;
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			if(rset.next()) {
				totalNoticeCount = rset.getInt("TOTAL_NOTICE");
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
		return totalNoticeCount;
		
	}
}
