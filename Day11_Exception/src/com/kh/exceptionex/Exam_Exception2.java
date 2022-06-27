package com.kh.exceptionex;

public class Exam_Exception2 {
	public static void main(String[] args) {
		int [] arrs = new int[3];
		for(int i = 0; i< arrs.length; i++) {
			arrs[i] = i;
		}
		System.out.println(arrs[3]);
	}
	
}
