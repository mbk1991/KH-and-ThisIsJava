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
		// ��ü�� ��쿡�� �ߺ����� ������� �ʰ� �ϱ����ؼ�
		// equals()�޼ҵ带 �������Ͽ� ���ϵ��� ��
		if (obj instanceof Student) {
			Student std = (Student) obj;
			return this.hashCode() == std.hashCode(); // ���� �ؽ��ڵ�� ���� �ؽ��ڵ尡 ������?
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.name+this.score).hashCode();
		//��ü�� �ּҰ����� ������ �ʰ�
		//name+score�� ���������� ���ؼ� ������ Ȯ��.
	}

}
