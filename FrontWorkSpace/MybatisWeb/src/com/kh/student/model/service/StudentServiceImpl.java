package com.kh.student.model.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.common.SqlSessionTemplate;
import com.kh.student.model.store.StudentStoreLogic;
import com.kh.student.model.vo.Student;

public class StudentServiceImpl implements StudentService {
	//MVC패턴에서 Service의 역할은?
	//1.JDBC 연결을 담당하였다
	//2.트랜잭션 처리를 하였다
	
	@Override
	public int registerStudent(Student student) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new StudentStoreLogic().insertStudent(session,student);
		if(result > 0) {
			session.commit();
		}else {
			session.rollback();
		}
		
		
		return result;
	}
}
