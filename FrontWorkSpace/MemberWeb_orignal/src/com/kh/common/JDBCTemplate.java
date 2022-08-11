package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {
	private static JDBCTemplate instance;
	private static Connection conn;
	
	private JDBCTemplate() {}
	
	public static JDBCTemplate getInstance() {
		if(instance == null) {
			instance = new JDBCTemplate();
		}
		return instance;
	}
	// JDBCTemplate 인스턴스 싱글톤 패턴 적용
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
//		String url = "jdbc:oracle:thin:@sonof.iptime.org:8912:xe";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "MEMBERWEB";
		String password = "MEMBERWEB";
		String driver = "oracle.jdbc.driver.OracleDriver";
		if(conn == null || conn.isClosed()) {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			conn.setAutoCommit(false);
		}
		return conn;
	}
	public static void close() {
		try {
			if(conn != null) {
				if(!conn.isClosed()) {
					conn.close();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void commit() {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void rollback() {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
