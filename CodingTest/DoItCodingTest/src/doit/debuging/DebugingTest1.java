package doit.debuging;

import java.util.Scanner;

public class DebugingTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("testcas입력");
		int testcase = sc.nextInt();
		int answer = 0;
		int A[] = new int[10001];
		int S[] = new int[10001];
		for(int i=1; i<10000;i++) {
			A[i] = (int)(Math.random() * Integer.MAX_VALUE);
			S[i] = S[i-1] + A[i];
		}
		for(int t = 1; t< testcase; t++) {
			System.out.println("query입력");
		int query = sc.nextInt();
			for(int i = 0; i < query; i++) {
				System.out.println("start입력");
				int start = sc.nextInt();
				System.out.println("end입력");
				int end = sc.nextInt();
				answer += S[end] =S[start-1];
				System.out.println(testcase + " " +answer);
			}
		}
	}
}
