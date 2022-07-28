package com.kh.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.member.model.vo.Member;

public class MemberDAO {

	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	int result = 0;
	ArrayList<Member> mList = null;

	public ArrayList<Member> memberSelectAllDB(Connection conn) {
		String sql = "SELECT * FROM MEMBER_TBL";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			mList = new ArrayList<Member>();

			while (rset.next()) {
				Member member = new Member();
				member.setMemberId(rset.getString(1));
				member.setMemberPwd(rset.getString(2));
				member.setMemberName(rset.getString(3));
				member.setGender(rset.getString(4).charAt(0));
				member.setAge(rset.getInt(5));
				member.setEmail(rset.getString(6));
				member.setPhone(rset.getString(7));
				member.setAddress(rset.getString(8));
				member.setHobby(rset.getString(9));
				member.setEnrollDate(rset.getDate(10));
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

	public ArrayList<Member> memberSelectByIdDB(String inputId, Connection conn) {
		String sql = "SELECT * FROM  MEMBER_TBL WHERE MEMBER_ID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputId);
			rset = pstmt.executeQuery();
			mList = new ArrayList<Member>();

			while (rset.next()) {
				Member member = new Member();
				member.setMemberId(rset.getString(1));
				member.setMemberPwd(rset.getString(2));
				member.setMemberName(rset.getString(3));
				member.setGender(rset.getString(4).charAt(0));
				member.setAge(rset.getInt(5));
				member.setEmail(rset.getString(6));
				member.setPhone(rset.getString(7));
				member.setAddress(rset.getString(8));
				member.setHobby(rset.getString(9));
				member.setEnrollDate(rset.getDate(10));
				mList.add(member);
			}

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return mList;
	}

	public ArrayList<Member> memberSelectByNameDB(String inputName,Connection conn) {
		String sql = "SELECT * FROM MEMBER_TBL WHERE MEMBER_NAME = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputName);
			rset = pstmt.executeQuery();
			mList = new ArrayList<Member>();

			while (rset.next()) {
				Member member = new Member();
				member.setMemberId(rset.getString(1));
				member.setMemberPwd(rset.getString(2));
				member.setMemberName(rset.getString(3));
				member.setGender(rset.getString(4).charAt(0));
				member.setAge(rset.getInt(5));
				member.setEmail(rset.getString(6));
				member.setPhone(rset.getString(7));
				member.setAddress(rset.getString(8));
				member.setHobby(rset.getString(9));
				member.setEnrollDate(rset.getDate(10));
				mList.add(member);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mList;
	}

	public int memberInsertDB(Member member,Connection conn) {
		String sql = "INSERT INTO MEMBER_TBL VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPwd());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, String.valueOf(member.getGender()));
			pstmt.setInt(5, member.getAge());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getPhone());
			pstmt.setString(8, member.getAddress());
			pstmt.setString(9, member.getHobby());
			pstmt.setDate(10, member.getEnrollDate());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public int memberIdCheckDB(String inputIdForUpdate,Connection conn) {
		String sql = "SELECT COUNT(*) FROM MEMBER_TBL WHERE MEMBER_ID = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputIdForUpdate);
			rset = pstmt.executeQuery();

			while (rset.next()) {
				result = rset.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public int memberUpdateDB(Member member,Connection conn) {
		String sql = "UPDATE MEMBER_TBL SET MEMBER_PWD =?," + " MEMBER_NAME =?, GENDER =?, AGE =?,"
				+ " EMAIL =?, PHONE =?, ADDRESS =?, HOBBY =?" + "  WHERE MEMBER_ID = ?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, member.getMemberPwd());
			pstmt.setString(2, member.getMemberName());
			pstmt.setString(3, member.getGender() + "");
			pstmt.setInt(4, member.getAge());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getPhone());
			pstmt.setString(7, member.getAddress());
			pstmt.setString(8, member.getHobby());
			pstmt.setString(9, member.getMemberId());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}

		return result;
	}

	public String memberPwdCheckDB(String inputIdForDelete,Connection conn) {
		String sql = "SELECT MEMBER_PWD FROM MEMBER_TBL WHERE MEMBER_ID = ?";
		String dbPwd = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputIdForDelete);

			rset = pstmt.executeQuery();
			while (rset.next()) {
				dbPwd = rset.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dbPwd;
	}

	public int memberDeleteDB(String inputIdForDelete,Connection conn) {
		String sql = "DELETE FROM MEMBER_TBL WHERE MEMBER_ID = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputIdForDelete);
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
