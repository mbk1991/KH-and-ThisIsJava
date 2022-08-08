package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {
	private static JDBCTemplate instance;
	private static Connection conn;
//	Properties prop = new Properties(); 
	
	private JDBCTemplate() {}
	
	public static JDBCTemplate getInstance() {
		if(instance == null) {
			instance = new JDBCTemplate();
		}
		return instance;
	}
	
	public Connection createConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "MEMBERWEB";
		String password = "MEMBERWEB";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		
		try {
			if(conn == null || conn.isClosed()) {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password); 
//				conn.setAutoCommit(false);
			
			}
		} catch (SQLException e) {
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return conn;
	}
	
	public void close() {
		try {
			if(!conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
