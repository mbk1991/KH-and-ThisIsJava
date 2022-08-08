package com.kh.member.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {
	private static JDBCTemplate instance;
	private Connection conn;
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "MEMBERWEB";
	private final String PASSWORD = "MEMBERWEB";
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	private JDBCTemplate() {}
	
	public static JDBCTemplate getInstance() {
		if(instance == null) {
			instance = new JDBCTemplate();
		}
		
		return instance;
	}
	
	public Connection createConnection() {
			try {
				if(conn == null || conn.isClosed()) {
						Class.forName(DRIVER);
						conn =DriverManager.getConnection(URL, USER, PASSWORD);
				}
			} catch (ClassNotFoundException e) {
			} catch (SQLException e) {
			}
		
		return conn;
	}
}
