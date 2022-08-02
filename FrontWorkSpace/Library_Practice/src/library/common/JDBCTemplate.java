package library.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {

	private static JDBCTemplate jdbcTemplate;
	private static Connection conn;

	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "LIBRARY";
	private final String PASSWORD = "LIBRARY";
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";

	private JDBCTemplate() {
	};

	public static JDBCTemplate getInstance() {
		if (jdbcTemplate == null) {
			jdbcTemplate = new JDBCTemplate();
		}
		return jdbcTemplate;
	}
	
	public Connection createConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(conn);
		return conn;
	}

}
