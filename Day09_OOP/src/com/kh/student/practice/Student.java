package com.kh.student.practice;

public class Student {
	// �ʵ�
	private String name;
	private int kor;
	private int eng;
	private int math;

	// ������
	public Student() {
	}

	// �޼ҵ�
	public int getSum() {
		return kor + eng + math;
	}

	public double getAvg() {
		return getSum() / 3;
	}

	// �޼ҵ� getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
