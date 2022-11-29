package com.mabb.backjoon.controllEx;

import java.util.Scanner;

public class Back11659 {

	public static void main(String[] args) {
		/*
		 * 문제 설명 구간 합 구하기 4 수 N개가 주어졌을 때 i번째 수부터 j번째 수까지 합을 구하는 프로그램 첫째 줄에서 수의개수 N과 합을
		 * 구해야하는 횟수 M이 주어진다. 둘째 줄에서 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수. 셋재 줄부터 M개의 줄에는
		 * 합을 구해야 하는 구간 i와 j가 주어진다. M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
		 */

		/*
		 * 시간복잡도, 제한시간 N 10만, n^2일 경우 시간 초과.. 슈도 코드 N과 M을 각각 int형으로 받는다. N개의 수를
		 * 배열로 받는다. 구간합 배열을 만든다. i와 j를 M번 받는다. S[j] - S[i-1]을 출력한다.
		 */

		// 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("N :");
		int N = sc.nextInt();
		System.out.println("M :");
		int M = sc.nextInt();

		// int배열 입력받으면서 구간합 만들어주기.
		int[] A = new int[N];
		int[] S = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println(i + " :");
			A[i] = sc.nextInt();
			if(i == 0) {
				S[i] = A[i]; 
			}else {
				S[i] = S[i-1] + A[i];
			}
		}
		// 구간합 배열 만들기 여기가 문제다. n^2을 해소해주어야 한다.

		// i와j를 입력받고 결과값 출력하기
		for (int i = 0; i < M; i++) {
			System.out.println("start :");
			int start = sc.nextInt();
			start = (start > 0) ? start - 1 : 0;
			System.out.println("end :");
			int end = sc.nextInt();
			end = (end > 0) ? end - 1 : 0;
			System.out.println(S[end] - S[start] + A[start]);
		}
	}
	
}
