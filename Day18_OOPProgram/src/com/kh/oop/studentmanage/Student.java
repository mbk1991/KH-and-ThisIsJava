package com.kh.oop.studentmanage;

public class Student {
	private int studentNum;
	private String name;
	private int age;
	private String grade;
	private boolean isTestPass;

	public Student(int StudentNum, String name, int age, String grade, boolean isTestPass) {
		this.studentNum = studentNum;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.isTestPass = isTestPass;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public boolean isTestPass() {
		return isTestPass;
	}

	public void setTestPass(boolean isTestPass) {
		this.isTestPass = isTestPass;
	}

}
