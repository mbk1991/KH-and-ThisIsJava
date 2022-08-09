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
	Member member;
	int result;

	public int memberInsertDB(Member member, Connection conn) {
		String sql = "INSERT INTO MEMBER_TABLE VALUES(?,?,?,?,?,DEFAULT)";
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

}
