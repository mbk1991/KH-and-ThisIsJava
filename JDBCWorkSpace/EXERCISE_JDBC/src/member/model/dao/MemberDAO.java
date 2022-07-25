package member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import member.model.vo.Member;

public class MemberDAO {
	// sql디벨로퍼의 계정 속성을 보면 접속세부정보를 확인할 수 있다.
	// oracle.jdbc.driver.OracleDriver";
	// jdbc:oracle:thin:@localhost:1521:xe

	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user = "MEMBER";
	private final String password = "MEMBER";
	private final String driver = "oracle.jdbc.driver.OracleDriver";

	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rset = null;
	int result;

	public ArrayList<Member> memberSelectAllDB() {
		Member member = new Member();
		ArrayList<Member> mList = new ArrayList<Member>();
		
		String sql = "SELECT * FROM MEMBER_TBL";
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.prepareStatement(sql);
			rset = stmt.executeQuery();
			
			while(rset.next()) {
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberPwd(rset.getString("MEMBER_PWD"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setMemberSsn(rset.getString("MEMBER_SSN"));
				member.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
				member.setMemberPhone(rset.getString("MEMBER_PHONE"));
				member.setMemberEmail(rset.getString("MEMBER_EMAIL"));
				member.setJoinDate(rset.getDate("JOIN_DATE"));
				
				mList.add(member);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return mList;
		
	}

	public int memberInsertDB(Member member) {
		String sql = "INSERT INTO MEMBER_TBL VALUES(?,?,?,?,?,?,?,DEFAULT)";
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, member.getMemberId());
			stmt.setString(2, member.getMemberPwd());
			stmt.setString(3, member.getMemberName());
			stmt.setString(4, member.getMemberSsn());
			stmt.setString(5, member.getMemberAddress());
			stmt.setString(6, member.getMemberPhone());
			stmt.setString(7, member.getMemberEmail());

			result = stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return result;

	}
}
