package kh.or.iei.student.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;

import kh.or.iei.student.model.vo.Student;

public class StudentDAO {
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user = "STUDENT";
	private final String password = "STUDENT";
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";

	public int insertStudent(Student student) {
		// 1. 드라이버 등록
		// 2. DBMS연결
		// 3. Statement 생성 쿼리 실행 객체
		// 4. 쿼리문 실행
		// 5. 결과값 받기 SELECT -> resultSet객체 반환 / INSERT,UPDATE,DELETE -> result int 타입
		// 반환(1,0)
		// 6. 자원해제(close)

		String query = "INSERT INTO STUDENT_TBL VALUES(" + "'" + student.getStudentId() + "'," + "'"
				+ student.getStudentPwd() + "'," + "'" + student.getStudentName() + "'," + "'" + student.getGender()
				+ "'," + "" + student.getAge() + "," + "'" + student.getEmail() + "'," + "'" + student.getPhone() + "',"
				+ "'" + student.getAddress() + "'," + "'" + student.getHobby() + "'," + " DEFAULT" + ")";

		Connection conn = null;
		Statement stmt = null;
//		ResultSet rset = null;  // DQL(select)만 리절트셋이 나옴
		int result = 0; // DML 중 insert,update,delete는 리절트셋이 안 나옴.성공1 실패 0을 받기 위함

		try {
			Class.forName(DRIVER); // 1. 드라이버 등록
			conn = DriverManager.getConnection(url, user, password); // 2.DBMS연결
			stmt = conn.createStatement(); // 3.Statement 생성
			result = stmt.executeUpdate(query);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public ArrayList<Student> showAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM STUDENT_TBL";
		ArrayList<Student> sList = null;

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			sList = new ArrayList<Student>();

			while (rset.next()) {
				Student student = new Student();

				student.setStudentId(rset.getString("STUDENT_ID"));
				student.setStudentPwd(rset.getString("STUDENT_PWD"));
				student.setStudentName(rset.getString("STUDENT_NAME"));
				student.setGender(rset.getString("GENDER").charAt(0));
				student.setAge(rset.getInt("AGE"));
				student.setEmail(rset.getString("EMAIL"));
				student.setPhone(rset.getString("PHONE"));
				student.setAddress(rset.getString("ADDRESS"));
				student.setHobby(rset.getString("HOBBY"));
				student.setEnrollDate(rset.getDate("ENROLL_DATE"));

				sList.add(student);
				System.out.println("Dao.showAll메소드 : " + student.getStudentName());

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(sList);

		return sList;
	}

	public Student showById(String id) {
		Student student = new Student();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String sql = "SELECT * FROM STUDENT_TBL WHERE STUDENT_ID = '" + id + "'";

		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);

			while (rset.next()) {
				student.setStudentId(rset.getString("STUDENT_ID"));
				student.setStudentPwd(rset.getString("STUDENT_PWD"));
				student.setStudentName(rset.getString("STUDENT_NAME"));
				student.setGender(rset.getString("GENDER").charAt(0));
				student.setAge(rset.getInt("AGE"));
				student.setEmail(rset.getString("EMAIL"));
				student.setPhone(rset.getString("PHONE"));
				student.setAddress(rset.getString("ADDRESS"));
				student.setHobby(rset.getString("HOBBY"));
				student.setEnrollDate(rset.getDate("ENROLL_DATE"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}

	public ArrayList<Student> selectStudentsByName(String studentName) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Student> sList = null;
		String sql = "SELECT * FROM STUDENT_TBL WHERE STUDENT_NAME LIKE '%" + studentName + "%'";

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			sList = new ArrayList<Student>();
			while (rset.next()) {
				Student student = new Student();
				student.setStudentId(rset.getString("STUDENT_ID"));
				student.setAge(rset.getInt("AGE"));
				student.setGender(rset.getString("GENDER").charAt(0));
				student.setEnrollDate(rset.getDate("ENROLL_DATE"));
				sList.add(student);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sList;
	}

	public int deleteStudent(String studentId) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String sql = "DELETE FROM STUDENT_TBL WHERE STUDENT_ID = '" + studentId + "'";

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int checkStudentId(String inputId) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		int result = 0;
		String sql = "SELECT COUNT(*) AS COUNT FROM STUDENT_TBL WHERE STUDENT_ID = '"+inputId+"'";
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				result = rset.getInt("COUNT");
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
		
		return result;
	}

	public int updateStudent(Student student) {
		Connection conn = null;
		Statement stmt = null;
		//ResultSet rset = null;
		int result = 0;
		String sql = "UPDATE STUDENT_TBL SET STUDENT_PWD ='"+student.getStudentPwd()+"', EMAIL = '"+student.getEmail()+"', PHONE = '"+student.getPhone()+"',ADDRESS = '"+student.getAddress()+"',HOBBY = '"+student.getHobby()+"'  WHERE STUDENT_ID = '"+student.getStudentId()+"'";
		
		try {
			Class.forName(DRIVER);
			try {
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("DAO result :" +result);
		return result;
	}
}
