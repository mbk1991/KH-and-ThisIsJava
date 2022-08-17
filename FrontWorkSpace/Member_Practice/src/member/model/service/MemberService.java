package member.model.service;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import member.model.common.JDBCTemplate;
import member.model.dao.MemberDAO;
import member.model.vo.Member;
import member.model.vo.Notice;
import member.model.vo.NoticePageData;

public class MemberService {
	JDBCTemplate jdbcTemplate;
	MemberDAO mDao;
	Connection conn;
	ArrayList<Member> mList;
	int result;

	public MemberService() {
		jdbcTemplate = JDBCTemplate.getInstance();
		mDao = new MemberDAO();
	}

	public int memberCreate(Member member) {
		try {
			conn = jdbcTemplate.createConnection();
			result = mDao.memberInsertDB(member, conn);
			if (result > 0) {
				JDBCTemplate.commit();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			JDBCTemplate.rollback();
			e.printStackTrace();
		}

		return result;
	}

	public String loginCheck(String id, String pwd) {
		String checkResult = "";
		try {
			conn = jdbcTemplate.createConnection();
			checkResult = mDao.loginCheckDB(id, pwd, conn);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close();
		}
		return checkResult;
	}

	public NoticePageData noticeRead(int currentPage) {
		NoticePageData npd = null;
		try {
			conn = jdbcTemplate.createConnection();
			npd = mDao.noticeAllSelectDb(currentPage, conn);
			if (npd != null) {
				JDBCTemplate.commit();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			JDBCTemplate.rollback();
			e.printStackTrace();
		} finally {
			JDBCTemplate.close();
		}

		return npd;
	}

	public Notice noticeDetailRead(int noticeNo) {
		Notice notice = null;
		try {
			conn = jdbcTemplate.createConnection();
			notice = mDao.noticeDetailSelectDB(noticeNo,conn);
			if(notice != null) {
				JDBCTemplate.commit();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback();
		}
		
		return notice;
	}

}
