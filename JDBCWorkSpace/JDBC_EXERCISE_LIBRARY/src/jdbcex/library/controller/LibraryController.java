package jdbcex.library.controller;

import java.util.ArrayList;

import jdbcex.library.model.dao.LibraryDAO;
import jdbcex.library.model.vo.Book;
import jdbcex.library.model.vo.Lease;
import jdbcex.library.model.vo.User;

public class LibraryController {
	LibraryDAO lDao = new LibraryDAO();
	ArrayList<Book> bList = null;
	ArrayList<User> uList = null;
	ArrayList<Lease> lList = null;
	
	public ArrayList<Book> selectAllBookControl() {
		bList = lDao.selectAllBookFromDB();
		return bList;
	}

	public ArrayList<User> selectAllUserControl() {
		uList = lDao.selectAllUserFromDB();
		return uList;
	}

	public ArrayList<Lease> selectAllLeaseControl() {
		lList = lDao.selectAllLeaseFromDB();
		return lList;
	}

	public ArrayList<Book> selectBookByNoControl(String inputBookCode) {
		bList = lDao.selectBookByNoFromDB(inputBookCode);
		return bList;
	}

	public int registBookControl(Book book) {
		int result = lDao.insertBookToDB(book);
		return result;
	}




}
