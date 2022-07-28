package com.kh.member.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//DB 연결 작업을 할 클래스.
public class JDBCTemplate {
	private static JDBCTemplate instance;
	private static Connection conn;
	Properties prop = new Properties();

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
		
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "STUDENT";
//		String password = "STUDENT";
		
		FileReader fReader;
		try {
			fReader = new FileReader("resources/driver.properties");
			prop.load(fReader);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		String DRIVER = prop.getProperty("driver");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} // 여기서 바로 닫으면 못씀. 리턴을 해야하니까 닫아주지 않음.
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
