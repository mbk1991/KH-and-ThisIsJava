package com.kh.control;

public class Exam_Continue {
	public static void main(String[] args) {
		// 1~30 사이의 수 중 3의 배수를 제외하고 출력
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) continue;
			System.out.print(i + " ");
		}
	}
}
