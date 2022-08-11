package com.kh.notice.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.notice.model.dao.NoticeDAO;
import com.kh.notice.model.vo.Notice;
import com.kh.notice.model.vo.PageData;

public class NoticeService {
	// 1. DB연결
	// 2. 커밋, 롤백
	private JDBCTemplate jdbcTemplate;
	private NoticeDAO nDao;
	
	public NoticeService() {
		jdbcTemplate = JDBCTemplate.getInstance();
		nDao = new NoticeDAO();
	}

	public int insertNotice(Notice notice) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.createConnection();
			result = nDao.insertNotice(notice, conn);
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

	public PageData selectAllList(int currentPage) {
		// 1. Map 사용
		// 2. VO 사용
		Connection conn = null;
		ArrayList<Notice> nList = null;
		String pageNavi = null;
		PageData pd = new PageData();
		try {
			conn = jdbcTemplate.createConnection();
			nList = nDao.selectAllList(conn, currentPage);
			pageNavi = nDao.getPageNavi(conn, currentPage);
			pd.setNoticeList(nList);
			pd.setPageNavi(pageNavi);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close();
		}
		return pd;
	}

	public Notice selectOneByNo(int noticeNo) {
		Connection conn = null;
		Notice notice = null;
		try {
			conn = jdbcTemplate.createConnection();
			notice = nDao.selectOneByNo(noticeNo, conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
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
			result = nDao.deleteNotice(noticeNo, conn);
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

	public int updateNotice(Notice notice) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.createConnection();
			result = nDao.updateNotice(notice, conn);
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







