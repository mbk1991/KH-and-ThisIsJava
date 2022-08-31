package com.kh.lecture.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.common.SqlSessionTemplate;
import com.kh.lecture.model.domain.Lecture;
import com.kh.lecture.model.store.LectureStoreLogic;

public class LectureServiceImpl implements LectureService {

	@Override
	public int registLecture(Lecture lecture) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new LectureStoreLogic().insertLecture(session, lecture);
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		return result;
	}

	@Override
	public List<Lecture> printAllLecture() {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		List<Lecture> lecList = new LectureStoreLogic().selectAllLecture(session);

		return lecList;
	}

	@Override
	public Lecture printOneLecture(int lectureNo) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Lecture lecture = new LectureStoreLogic().selectOneLecture(session, lectureNo);
		session.close();
		return lecture;
	}

	@Override
	public int deleteLecture(int lectureNo) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new LectureStoreLogic().deleteLecture(session, lectureNo);
		if (result > 0) {
			session.commit();
		} else {
			session.rollback();
		}
		return result;
	}

	@Override
	public int updateLecture(Lecture lecture) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new LectureStoreLogic().updateLecture(session, lecture);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}
}
