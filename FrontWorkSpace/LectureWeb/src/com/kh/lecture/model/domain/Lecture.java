package com.kh.lecture.model.domain;

import java.sql.Date;

public class Lecture {
	private int lectureNo;
	private String lectureName;
	private String lectureInstructor;
	private String lectureIntroduce;
	private Date regDate;
	private String useYn;

	public Lecture() {
	}

	public Lecture(String lectureName, String lectureInstructor, String lectureIntroduce) {
		super();
		this.lectureName = lectureName;
		this.lectureInstructor = lectureInstructor;
		this.lectureIntroduce = lectureIntroduce;
	}

	public Lecture(int lectureNo, String lectureName, String lectureInstructor, String lectureIntroduce, Date regDate,
			String useYn) {
		super();
		this.lectureNo = lectureNo;
		this.lectureName = lectureName;
		this.lectureInstructor = lectureInstructor;
		this.lectureIntroduce = lectureIntroduce;
		this.regDate = regDate;
		this.useYn = useYn;
	}

	
	
	public Lecture(int lectureNo, String lectureName, String lectureInstructor, String lectureIntroduce) {
		super();
		this.lectureNo = lectureNo;
		this.lectureName = lectureName;
		this.lectureInstructor = lectureInstructor;
		this.lectureIntroduce = lectureIntroduce;
	}

	@Override
	public String toString() {
		return "Lecture [강좌번호=" + lectureNo + ", 강좌명=" + lectureName + ", 강사명="
				+ lectureInstructor + ", 강좌소개=" + lectureIntroduce + ", 강좌등록일=" + regDate + ", 개설여부="
				+ useYn + "]";
	}

	public int getLectureNo() {
		return lectureNo;
	}

	public void setLectureNo(int lectureNo) {
		this.lectureNo = lectureNo;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public String getLectureInstructor() {
		return lectureInstructor;
	}

	public void setLectureInstructor(String lectureInstructor) {
		this.lectureInstructor = lectureInstructor;
	}

	public String getLectureIntroduce() {
		return lectureIntroduce;
	}

	public void setLectureIntroduce(String lectureIntroduce) {
		this.lectureIntroduce = lectureIntroduce;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

}
