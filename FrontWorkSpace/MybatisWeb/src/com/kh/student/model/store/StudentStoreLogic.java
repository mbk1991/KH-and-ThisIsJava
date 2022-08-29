package com.kh.student.model.store;

import org.apache.ibatis.session.SqlSession;

import com.kh.student.model.vo.Student;

public class StudentStoreLogic implements StudentStore {

	@Override
	public int insertStudent(SqlSession session, Student student) {
		//SqlSession 객체의 메소드로 쿼리문을 실행한다.
		//쿼리문은 xml에 작성한다.
		int result = session.insert("StudentMapper.insertStudent",student);
		return result;
	}
}
