package com.kh.lecture.model.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.lecture.model.domain.Lecture;

public class LectureStoreLogic implements LectureStore {

	@Override
	public int insertLecture(SqlSession session, Lecture lecture) {
		int result = session.insert("LectureMapper.insertLecture", lecture);
		return result;
	}

	@Override
	public List<Lecture> selectAllLecture(SqlSession session) {
		List<Lecture> lecList = session.selectList("LectureMapper.selectAllLecture");
		return lecList;
	}

	@Override
	public Lecture selectOneLecture(SqlSession session, int lectureNo) {
		Lecture lecture = session.selectOne("LectureMapper.selectOneLecture",lectureNo);
		return lecture;
	}
}
