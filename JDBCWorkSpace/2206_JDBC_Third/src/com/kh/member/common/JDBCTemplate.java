package com.kh.member.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//DB 연결 작업을 할 클래스.
public class JDBCTemplate {
	private static JDBCTemplate instance;
	private static Connection conn;

	private JDBCTemplate() {
	}

	public static JDBCTemplate getInstance() {
		if (instance == null) {
			instance = new JDBCTemplate();
		}
		return instance;
	}

	public Connection createConnection() {
		if(conn != null) {
			return conn;
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "STUDENT";
		String password = "STUDENT";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} // 여기서 바로 닫으면 못씀. 리턴을 해야하니까 닫아주지 않음.

		return conn;
		
	}
	
	public void close() {
		if(conn != null) {
			try {
				if(!conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
	}
}
