package com.kh.method;

import com.kh.exercise.Exercise_Method;

public class Exam_Method {
	public static void main(String[] args) {
		Exercise_Method exMethod = new Exercise_Method();
		exMethod.calcNumPrint();
		System.out.println("�Ű������� ���� ��ȯ���� �ִ� �޼ҵ��� ���ϰ�:" + exMethod.calcNum());
		exMethod.calcNumPrint(500);
		System.out.println("�Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ��� ��ȯ��:" + exMethod.calcNum(500));
	}
}
