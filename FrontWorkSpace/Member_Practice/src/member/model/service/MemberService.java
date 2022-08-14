package member.model.service;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import member.model.common.JDBCTemplate;
import member.model.dao.MemberDAO;
import member.model.vo.Member;

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

	public int memberInsert(Member member) {
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
		System.out.println("서비스: id, pwd "+ id+" : "+ pwd);
		try {
			conn = jdbcTemplate.createConnection();
			checkResult = mDao.loginCheckDB(id,pwd,conn);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close();
		}
		return checkResult;
	}


}
