package com.kh.array;

import java.util.Scanner;

public class Exam_Array {
	public static void main(String[] args) {
		//int kor1, kor2, kor3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�� >");
		int arrayLengrh = sc.nextInt();
		int[] kors = new int[arrayLengrh];  //�����Ҵ�ȴ�.
	
		//kors <- �迭�� ù��° �ּҸ� ����
		
//		kors[0] = 1;  //�ּҸ� ���� ������ �ϵ� �ε����� ���, ù��° 0�� �ε���
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
