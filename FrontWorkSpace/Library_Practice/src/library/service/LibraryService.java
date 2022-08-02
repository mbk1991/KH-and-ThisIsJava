package library.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import library.common.JDBCTemplate;
import library.model.dao.LibraryDAO;
import library.model.vo.Book;

public class LibraryService {
	JDBCTemplate jdbcTemplate = null;
	Connection conn = null;
	LibraryDAO lDao = null;
	ArrayList<Book> bList = null;
	
	public LibraryService()   {
			jdbcTemplate = JDBCTemplate.getInstance();
			lDao = new LibraryDAO();
	}
	
	public ArrayList<Book> selectAllBookService(){
		conn = jdbcTemplate.createConnection();
		bList = lDao.selectAllBookDB(conn);
		return bList;
	}
}
