package com.kh.lecture.model.service;

import java.util.List;

import com.kh.lecture.model.domain.Lecture;

public interface LectureService {
	//registLecture
	public int registLecture(Lecture lecture);
	public List<Lecture> printAllLecture();
	public Lecture printOneLecture(int lectureNo);
}
