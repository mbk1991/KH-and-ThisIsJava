package com.kh.notice.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.notice.model.dao.NoticeDAO;
import com.kh.notice.model.vo.Notice;

public class NoticeService {
	//1.DB연결
	//2.커밋,롤백
	private JDBCTemplate jdbcTemplate;
	private NoticeDAO nDao;
	private Connection conn;
	ArrayList<Notice> nList;
	
	
	public NoticeService() {
		jdbcTemplate = JDBCTemplate.getInstance();
		nDao = new NoticeDAO();
	}

	public int insertNotice(Notice notice) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.createConnection();
			result = nDao.insertNotice(notice,conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public ArrayList<Notice> selectAllNotice() {
		try {
			conn = jdbcTemplate.createConnection();
			nList = nDao.selectAllNotice(conn);
			if(nList!=null) {
				JDBCTemplate.commit();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback();
		}
		
		return nList;
	}
}
