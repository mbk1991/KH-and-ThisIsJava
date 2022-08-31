package com.kh.lecture.model.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.lecture.model.domain.Lecture;

public interface LectureStore {
	public int insertLecture(SqlSession session, Lecture lecture);
	public List<Lecture> selectAllLecture(SqlSession session);
	public Lecture selectOneLecture(SqlSession session, int lectureNo);
	public int deleteLecture(SqlSession session,int lectureNo);
	public int updateLecture(SqlSession session, Lecture lecture);
}
