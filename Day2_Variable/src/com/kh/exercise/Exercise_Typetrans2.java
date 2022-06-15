package com.kh.exercise;
import java.util.Scanner;

public class Exercise_Typetrans2 {
	public static void main(String[] args) {
		int iNum1 = 3;
		double iNum2 = 2.234;
		String str = "abc";
		double result = iNum1 + iNum2;
		String result2 = iNum1 + str;
		System.out.println(result);
		System.out.println((int)result);
		System.out.println(result2);
		
	}
}
