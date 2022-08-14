package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import member.model.common.JDBCTemplate;
import member.model.vo.Member;

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

	public String loginCheckDB(String id,String pwd, Connection conn) {
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

//	public int loginCheckDB(String id, String pwd, Connection conn) {
//		String sql = "SELECT COUNT(*) AS COUNT FROM MEMBER_TABLE WHERE MEMBER_ID=? AND MEMBER_PWD=?";
//		int checkResult = 0;
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1,id);
//			pstmt.setString(2,pwd);
//			rset = pstmt.executeQuery();
//			while(rset.next()) {
//				checkResult = rset.getInt("COUNT");
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rset.close();
//				pstmt.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return checkResult;
//	}
}
