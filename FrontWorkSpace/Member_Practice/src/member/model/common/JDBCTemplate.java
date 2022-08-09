package member.model.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {
	private static JDBCTemplate instance;
	private static Connection conn;
	private Properties prop;
	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	private JDBCTemplate() {
		// 생성자에서 프로퍼티를 이용하여 필드를 초기화해본다. 이렇게 하는지 맞는지는 모르겠음.
		// 생성자 안에 예외처리를 만들어도 되는지 모르겠음.
		if (prop == null) {
			prop = new Properties();
			try {
				prop.load(new FileReader("/resources/jdbcInfo.properties"));
				driver = prop.getProperty("DRIVER");
				url = prop.getProperty("URL");
				user = prop.getProperty("USER");
				password = prop.getProperty("PASSWORD");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static JDBCTemplate getInstance() {
		// JDBCTemplate 싱글톤패턴
		if (instance == null) {
			instance = new JDBCTemplate();
		}
		return instance;
	}

	public Connection createConnection() throws FileNotFoundException, SQLException {
		if (conn == null && conn.isClosed()) {
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				conn.setAutoCommit(false);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void close() {
		try {
			if(conn != null && !(conn.isClosed())) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void commit() {
		try {
			if(conn !=null && !(conn.isClosed())) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback() {
		try {
			if(conn !=null && !(conn.isClosed())) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
