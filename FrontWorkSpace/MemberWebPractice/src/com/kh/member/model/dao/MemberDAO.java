package com.kh.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kh.member.model.vo.Member;

public class MemberDAO {
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rset = null;
	int result;

	public int memberInsertDB(Member member, Connection conn) {
		String sql = "INSERT INTO MEMBER_TBL2 VALUES(?,?,?,?,?,?,SYSDATE)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPwd());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberBirth());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getPhone());
			
			result = pstmt.executeUpdate();
			System.out.println("dao result" + result);
			System.out.println(member.getMemberBirth());
		} catch (SQLException e) {
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
			}
		}
		return result;
	}

}
