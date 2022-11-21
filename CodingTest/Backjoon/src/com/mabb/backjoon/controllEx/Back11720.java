package com.mabb.backjoon.controllEx;

import java.io.PrintStream;
import java.util.Scanner;

public class Back11720 {
	public static void main(String[] args) {
		//첫째 줄 숫자의 개수
		//둘째 줄 공백없이 주어진N개의 숫자
		//주어진 숫자 N개의 합 출력
		//제한시간 1초
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String inputStr = sc.next();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			String s = inputStr.substring(i, i+1);
			sum+= Integer.parseInt(s);
		}
		System.out.println(sum);
	}
}
