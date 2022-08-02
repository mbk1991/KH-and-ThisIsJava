package library.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import library.model.vo.Book;

public class LibraryDAO {
	ArrayList<Book> bList = null;
	Book book = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rset = null;

	public ArrayList<Book> selectAllBookDB(Connection conn) {
		String sql = "SELECT * FROM BOOK";
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			bList = new ArrayList<Book>();
			while (rset.next()) {
				int bookNo = rset.getInt(1);
				String bookName = rset.getString(2);
				String writer = rset.getString(3);
				int price = rset.getInt(4);
				String publisher = rset.getString(5);
				String genre = rset.getString(6);

				book = new Book(bookNo, bookName, writer, price, publisher, genre);
				bList.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bList;
	}

}
