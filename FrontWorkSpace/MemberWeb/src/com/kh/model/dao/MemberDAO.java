package com.kh.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.model.vo.Member;

public class MemberDAO {
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rset = null;
	ArrayList<Member> mList = null;
	int result;

	public int insertMember(Member member, Connection conn) {
		String sql = "INSERT INTO MEMBER_TBL VALUES(?,?,?,?,?,?,?,?,?,SYSDATE)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPwd());
			pstmt.setString(3, member.getMemberName());
			pstmt.setInt(4, member.getMemberAge());
			pstmt.setString(5, member.getMemberEmail());
			pstmt.setString(6, member.getMemberPhone());
			pstmt.setString(7, member.getMemberAddress());
			pstmt.setString(8, member.getMemberGender());
			pstmt.setString(9, member.getMemberHobby());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
			}
		}

		return result;
	}

	public int selectOneMember(String memberId, String memberPwd, Connection conn) {
		String sql = "SELECT COUNT(*) AS MEMBER_COUNT FROM MEMBER_TBL WHERE MEMBER_ID =? AND MEMBER_PWD = ?";
		int isMember = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPwd);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				isMember = rset.getInt("MEMBER_COUNT");
			}
		} catch (SQLException e) {
		} finally {
			try {
				rset.close();
				pstmt.close();
			} catch (SQLException e) {
			}
		}

		return isMember;
	}

//전체 회원조회
	public ArrayList<Member> selectAllmember(Connection conn) {
		String sql = "SELECT * FROM MEMBER_TBL";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			mList = new ArrayList<Member>();
			while (rset.next()) {
				Member member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setMemberAge(rset.getInt("MEMBER_AGE"));
				member.setMemberEmail(rset.getString("MEMBER_EMAIL"));
				member.setMemberPhone(rset.getString("MEMBER_PHONE"));
				member.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
				member.setMemberGender(rset.getString("MEMBER_GENDER"));
				member.setMemberHobby(rset.getString("MEMBER_HOBBY"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
				mList.add(member);
			}

		} catch (SQLException e) {
		}

		return mList;
	}

	public Member myInfoSelect(String memberIdInput, Connection conn) {
		String sql = "SELECT * FROM MEMBER_TBL WHERE MEMBER_ID =?";
		Member member = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberIdInput);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				String memberId = rset.getString("MEMBER_ID");
				String memberPwd = rset.getString("MEMBER_ID");
				String memberName = rset.getString("MEMBER_NAME");
				int memberAge = Integer.parseInt(rset.getString("MEMBER_AGE"));
				String memberEmail = rset.getString("MEMBER_EMAIL");
				String memberPhone = rset.getString("MEMBER_PHONE");
				String memberAddress = rset.getString("MEMBER_ADDRESS");
				String memberGender = rset.getString("MEMBER_GENDER");
				String memberHobby = rset.getString("MEMBER_HOBBY");
				Date enrollDate = rset.getDate("ENROLL_DATE");
				member = new Member(memberId, memberPwd, memberName, memberAge, memberEmail, memberPhone, memberAddress,
						memberGender, memberHobby ,enrollDate);
				System.out.println(rset.getString("MEMBER_HOBBY"));
				System.out.println("dao" + member);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}

}
