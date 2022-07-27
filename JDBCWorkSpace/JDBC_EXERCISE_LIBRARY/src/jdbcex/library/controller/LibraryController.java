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

	public ArrayList<Book> selectAllControl(String tableName) {
		//반환값의 타입이 문제이다.
		if(tableName.equals("BOOK")) {
			bList = lDao.selectAllFromDB(tableName); 
		}else if(tableName.equals("CUSTOMER")) {
			uList = lDao.selectAllFromDB(tableName);
		}else if(tableName.equals("LIBRARY")) {
			lList = lDao.selectAllFromDB(tableName);
		}
		
		return bList;
	}

}
