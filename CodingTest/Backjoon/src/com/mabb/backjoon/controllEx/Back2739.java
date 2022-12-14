package com.mabb.backjoon.controllEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2739 {
	public static void main(String[] args) throws IOException {
		//N단을 입력받아 출력형식에 맞춰 구구단을 출력하는 문제
		/*
		 * 1.N을 입력받는다
		 * 2.for(i=1; i<=9; i++) 출력: N * i = N * i
		 */
		
		//N을 입력받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",N,i,N*i);
			
		}
	}
}
