package com.kh.control;

public class Exam_Continue {
	public static void main(String[] args) {
		// 1~30 ������ �� �� 3�� ����� �����ϰ� ���
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) continue;
			System.out.print(i + " ");
		}
	}
}
