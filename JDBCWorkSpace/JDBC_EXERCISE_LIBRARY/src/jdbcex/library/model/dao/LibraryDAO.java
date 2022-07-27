package jdbcex.library.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import jdbcex.library.model.vo.Book;
import jdbcex.library.model.vo.Lease;
import jdbcex.library.model.vo.Library;
import jdbcex.library.model.vo.User;

public class LibraryDAO {
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user = "LIBRARY";
	private final String password = "LIBRARY";
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";

	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	ArrayList<Library> superList = null;
	ArrayList<Book> bList = null;
	ArrayList<User> uList = null;
	ArrayList<Lease> lList = null;
	Book voBook = null;
	User voUser = null;
	Lease voLease = null;
	int result;

	public ArrayList<Book> selectAllBookFromDB() {
		String sql = "SELECT * FROM BOOK";

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);

			bList = new ArrayList<Book>();
			while (rset.next()) {
				int bookNo = rset.getInt("BOOK_NO");
				String bookName = rset.getString("BOOK_NAME");
				String bookWriter = rset.getString("BOOK_WRITER");
				int bookPrice = rset.getInt("BOOK_PRICE");
				String publisher = rset.getString("PUBLISHER");
				String genre = rset.getString("GENRE");

				Book book = new Book(bookNo, bookName, bookWriter, bookPrice, publisher, genre);
				bList.add(book);
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
		return bList;
	}

	public ArrayList<User> selectAllUserFromDB() {
		String sql = "SELECT * FROM CUSTOMER";

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);

			uList = new ArrayList<User>();
			while (rset.next()) {

				int userNo = rset.getInt("USER_NO");
				String userId = rset.getString("USER_ID");
				String userName = rset.getString("USER_NAME");
				int userAge = rset.getInt("USER_AGE");
				String addr = rset.getString("ADDR");
				char gender = rset.getString("GENDER").charAt(0);
				Date enrollDate = rset.getDate("ENROLL_DATE");

				User user = new User(userNo, userId, userName, userAge, addr, gender, enrollDate);
				uList.add(user);
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

		return uList;
	}

	public ArrayList<Library> selectAllLeaseFromDB() {
		//문제의 요구사항이  대여번호, 회원아이디,회원이름,책이름 출력이었다.조인하라는 것.
		//리턴은 하나의 값만 할 수 있는데 여러 테이블을 조인한 경우의 값을 각각의 
		//어레이리스트로 반환할 수가 없다. 결국은 상속을 써야 하는 것 같다.
		//각각의 타입의 super타입으로?
		//각각의 vo들의 필드값이 모두 저장되어있는 부모클래스 Library가 필요한건가?
		//아니면 애초에 Library 하나만?
		String sql = "SELECT * "
				+ "FROM LIBRARY JOIN CUSTOMER USING(USER_ID) JOIN BOOK USING(BOOK_NO)";
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);

			superList = new ArrayList<Library>();
			while (rset.next()) {
				int leaseNo = rset.getInt("LEASE_NO");
				String userId = rset.getString("USER_ID");
				String userName = rset.getString("USER_NAME");
				Date leaseDate = rset.getDate("LEASE_DATE");
				Date returnDate = rset.getDate("RETURN_DATE");
				String bookName = rset.getString("BOOK_NAME");
				
				Lease lease = new Lease(leaseNo, userId, leaseDate, returnDate);
				User user = new User();
				user.setUserName(userName);
				Book book = new Book();
				book.setBookName(bookName);
				superList.add(lease);
				superList.add(book);
				superList.add(user);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return superList;
	}

	public ArrayList<Book> selectBookByNoFromDB(String inputBookNo) {
		String sql = "SELECT * FROM BOOK WHERE BOOK_NO = ?";
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputBookNo);
			rset = pstmt.executeQuery();

			bList = new ArrayList<Book>();
			while (rset.next()) {
				int bookNo = rset.getInt("BOOK_NO");
				String bookName = rset.getString("BOOK_NAME");
				String bookWriter = rset.getString("BOOK_WRITER");
				int bookPrice = rset.getInt("BOOK_PRICE");
				String publisher = rset.getString("PUBLISHER");
				String genre = rset.getString("GENRE");

				Book book = new Book(bookNo, bookName, bookWriter, bookPrice, publisher, genre);
				bList.add(book);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bList;
	}

	public int insertBookToDB(Book book) {
		String sql = "INSERT INTO BOOK VALUES(?,?,?,?,?,?)";
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(url,user,password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,book.getBookNo());
			pstmt.setString(2,book.getBookName());
			pstmt.setString(3,book.getBookWriter());
			pstmt.setInt(4,book.getBookPrice());
			pstmt.setString(5,book.getPublisher());
			pstmt.setString(6,book.getGenre());
			
			result = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
