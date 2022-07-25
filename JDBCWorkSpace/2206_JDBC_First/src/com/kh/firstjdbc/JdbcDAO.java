package com.kh.firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDAO {
	// DB에 접속해서 MEMBER_TBL테이블의 정보를 Console에 출력하시오
	/*
	 * 1. 드라이버등록 2. DBMS 연결 생성 3. Statement 객체 생성 4. SQL 전송(쿼리문 실행) 5. 결과값
	 * 받기(ResultSet) -> 콘솔 출력 6. 자원해제(close())
	 */

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "STUDENT";
		String password = "STUDENT";
		String query = "SELECT * FROM MEMBER_TBL";
		
		System.out.println("확인");

		Connection conn = null; // 연결을 담당하는 객체
		Statement stmt = null; // 쿼리문을 실행하는 객체
		ResultSet rset = null; // 쿼리문의 결과값 받기

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  //드라이버생성
			conn = DriverManager.getConnection(url, user, password); //연결
			stmt = conn.createStatement(); // 쿼리문 실행객체
			rset = stmt.executeQuery(query); // ResultSet 객체 (쿼리문의 resultset을 담고있다)
			while (rset.next()) {
				System.out.println(rset.getString("MEMBER_ID") + "," + rset.getNString("MEMBER_NAME"));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
	}
}
