package com.kh.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			System.out.println(rand.nextInt(10)+1);
		}
	}
}
