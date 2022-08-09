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
	Member member;
	int result;
	
	public MemberService() {
		jdbcTemplate = JDBCTemplate.getInstance();
		mDao = new MemberDAO();
	}

	public int memberInsert(Member member) {
		try {
			conn = jdbcTemplate.createConnection();
			result = mDao.memberInsertDB(member,conn);
			if(result > 0) {
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

}
