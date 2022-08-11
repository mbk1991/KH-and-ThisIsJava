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
		} finally {
			JDBCTemplate.close();
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
		} finally {
			JDBCTemplate.close();
		}
		
		return nList;
	}

	public Notice selectOneByNo(int noticeNo) {
		Notice notice = null;
		try {
			conn = jdbcTemplate.createConnection();
			notice = nDao.selectOneByNo(noticeNo,conn);
			if(notice != null) {
				JDBCTemplate.commit();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback();
		} finally {
			JDBCTemplate.close();
		}
			return notice;
	}

	public int deleteNotice(int noticeNo) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.createConnection();
			result = nDao.deleteNotice(noticeNo,conn);
			if(result > 0) {
				JDBCTemplate.commit();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			JDBCTemplate.rollback();
			e.printStackTrace();
		} finally {
			JDBCTemplate.close();
		}
		return result;
	}

	public int updateNotice(Notice notice) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.createConnection();
			result = nDao.updateNotice(notice,conn);
			if(result > 0) {
				JDBCTemplate.commit();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback();
		} finally {
			JDBCTemplate.close();
		}
		return result;
	}
}
