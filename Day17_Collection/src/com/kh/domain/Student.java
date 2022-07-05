package com.kh.domain;

public class Student {
	private String name;
	private int score;

	public Student() {
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ",score = " + score + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public boolean equals(Object obj) {
		// 객체인 경우에도 중복으로 저장되지 않게 하기위해서
		// equals()메소드를 재정의하여 비교하도록 함
		if (obj instanceof Student) {
			Student std = (Student) obj;
			return this.hashCode() == std.hashCode(); // 기존 해쉬코드와 다음 해쉬코드가 같은지?
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.name+this.score).hashCode();
		//객체의 주소값으로 비교하지 않고
		//name+score의 고유값으로 비교해서 같은지 확인.
	}

}
