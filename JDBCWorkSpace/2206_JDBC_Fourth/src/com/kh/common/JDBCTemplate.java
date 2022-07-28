package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {
	
	private static JDBCTemplate jdbcTemplate;
	private final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "MEMBER";
	private final String PASSWORD = "MEMBER";
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private Connection conn;
	
	private JDBCTemplate() {}
	
	public static JDBCTemplate getInstance() {
		if(jdbcTemplate == null) {
			jdbcTemplate = new JDBCTemplate();
		}
		return jdbcTemplate;
	}
	
	public Connection createConnection() {

		try {
			if(conn == null || conn.isClosed()) {
				Class.forName(DRIVER);
				conn = DriverManager.getConnection(URL,USER,PASSWORD);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void close(Connection conn) {
		try {
			if(conn != null &&!conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void rollback() {}
	

}
