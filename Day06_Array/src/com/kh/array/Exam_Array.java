package com.kh.array;

import java.util.Scanner;

public class Exam_Array {
	public static void main(String[] args) {
		//int kor1, kor2, kor3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 >");
		int arrayLengrh = sc.nextInt();
		int[] kors = new int[arrayLengrh];  //동적할당된다.
	
		//kors <- 배열의 첫번째 주소를 저장
		
//		kors[0] = 1;  //주소를 통해 접근을 하되 인덱스를 사용, 첫번째 0번 인덱스
//		kors[1] = 2;
//		kors[2] = 3;
				
		for(int i=0; i<kors.length; i++) {
			kors[i] = (i+1)*10;
		}
		
		for(int i=0 ; i<kors.length; i++) {
		System.out.println("kors["+i+"] : " + kors[i]);
		}
		System.out.println(kors);
		System.out.println("-----");

		kors = new int[10];
		for(int i=0; i<kors.length; i++) {
			System.out.println("kors["+i+"] : " + kors[i]);
		}
		System.out.println(kors);
		System.out.println("-----");
		
		int[] kors2;
		kors2 = new int[5];
		for(int i=0; i<kors2.length; i++) System.out.println("kors2["+i+"] : " + kors2[i]);
		System.out.println(kors2);
		System.out.println("-----");
		kors2 = new int[] {1,2,3,4,5};
		for(int i=0; i<kors2.length; i++) System.out.println("kors2["+i+"] : " + kors2[i]);
		System.out.println(kors2);
		System.out.println("-----");
	}
}
