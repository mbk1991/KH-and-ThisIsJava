package com.kh.firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDAO2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "STUDENT";
		String password = "STUDENT";
		String query = "SELECT * FROM MEMBER_TBL";

		Connection conn = null; // 연결객체
		Statement stmt = null; // 쿼리문 실행
		ResultSet rset = null; // 결과값

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1.
			conn = DriverManager.getConnection(url, user, password); // 2.
			stmt = conn.createStatement(); // 3.
			rset = stmt.executeQuery(query); // 4. 5.
			while (rset.next()) {
				System.out.println(rset.getString("MEMBER_ID") + ", " + rset.getString("MEMBER_NAME"));
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
