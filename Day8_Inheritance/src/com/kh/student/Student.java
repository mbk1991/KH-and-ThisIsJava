package com.kh.student;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}
	
	public Student(String name,int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//getter, setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	
	public int printTotal() {
		int sum = this.kor + this.eng + this.math;
		return sum;
	}
	
	public double printAvg() {
		double avg = printTotal() / 3.0;
		return avg;
	}
	

}
