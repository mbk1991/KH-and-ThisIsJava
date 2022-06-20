package com.kh.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		int[] intArray = new int[100];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
			System.out.printf("arra1[%d] : %d\n", i, intArray[i]);
		}
	}

	public void exercise2() {
//		String[] strArray = new String[5];
//		strArray = new String[] { "딸기", "바나나", "복숭아", "키위", "사과", "바나나" };
		String[] fruits = { "딸기", "복숭아", "키위", "사과", "바나나" };
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("바나나")) {
				System.out.println("fruits[" + i + "] : " + fruits[i]);
			}
		}
	}

	public void exercise3() {
		Scanner sc = new Scanner(System.in);
		int[] intArray2 = new int[5];

		System.out.println("양의 정수 5개 입력> ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("숫자%d> ", i + 1);
			intArray2[i] = sc.nextInt();
			while (intArray2[i] < 0) {
				System.out.printf("양의 정수를 입력하세요\n 숫자%d> ", i + 1);
				intArray2[i] = sc.nextInt();
			}
		}
//		for(int i=0; i<5; i++) {
//			System.out.println("intArray2["+i+"]" + intArray2[i]);
//		}

		int max = 0;
		for (int i = 0; i < intArray2.length; i++) {
			if (intArray2[i] >= max) {
				max = intArray2[i];
			}
		}
		System.out.println("입력한 숫자 중 최대값은 " + max);

	}

	public void exercise4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 5개 입력> ");
		int[] intArray3 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.printf("숫자%d> ", i + 1);
			intArray3[i] = sc.nextInt();
			while (intArray3[i] < 0) {
				System.out.printf("양의 정수를 입력하세요\n숫자%d> ", i + 1);
				intArray3[i] = sc.nextInt();
			}
		}
		double avg = 0.0;
		int sum = 0;
		for (int i = 0; i < intArray3.length; i++) {
			sum += intArray3[i];
		}
		avg = (double) sum / intArray3.length;
		System.out.println("입력한 숫자들의 평균은 " + avg);
	}

	public void exercise5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력 >");
		String number = sc.next();
		while ((number.charAt(6) != '-') || (number.length() > 14)) {
			System.out.println("양식에 맞춰 입력하세요.");
			System.out.println("xxxxxx-xxxxxxx");
			System.out.println("주민번호 입력 >");
			number = sc.next();
		}
		// *로 저장하여 출력이나 저장하고 *로 출력함.

		char[] charArray = new char[number.length()];
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = number.charAt(i);
		}

		// 깊은 복사.
		char[] maskingArray = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			if (i < 8) {
				maskingArray[i] = charArray[i];
			} else {
				maskingArray[i] = '*';
			}
		}

		for (int i = 0; i < maskingArray.length; i++) {
			System.out.print(maskingArray[i]);
		}
	}

	public void exercise6() {
		// 삽입정렬 예제

		Scanner sc = new Scanner(System.in);
//		System.out.println("5개의 양수 입력");
//		
//		int[] arrs = new int[5];
//		for (int i = 0; i < arrs.length; i++) {
//			System.out.print("숫자" + (i + 1) + "입력> ");
//			arrs[i] = sc.nextInt();
//			while(arrs[i]<0) {
//				System.out.println("양수를 입력하세요.");
//				System.out.print("숫자"+(i+1) +"> ");
//				arrs[i] = sc.nextInt();
//			}
//			
//		}

		// 입력이 귀찮으니 랜덤값을 넣어보자.
		System.out.print("배열의 길이 입력>");
		int arrayLength = sc.nextInt();
		while (arrayLength <= 0) {
			System.out.println("1이상의 양수를 입력하세요.");
			arrayLength = sc.nextInt();
		}

		int[] arrs = new int[arrayLength];
		Random rand = new Random();

		for (int i = 0; i < arrayLength; i++) {
			arrs[i] = rand.nextInt(1000);
		}

		System.out.println("정렬 전");
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}

		for (int i = 1; i < arrs.length; i++) {
			for (int j = (i - 1); j >= 0; j--) {
				if (arrs[j + 1] < arrs[j]) {
					int temp = arrs[j + 1];
					arrs[j + 1] = arrs[j];
					arrs[j] = temp;
				}
			}

			System.out.println("\n정렬 중-----");
			for (int k = 0; k < arrs.length; k++) {
				System.out.print(arrs[k] + " ");
			}

		}

		System.out.println("\n정렬 후");
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

	public void exercise7() {
		// 로또 자동 생성기 프로그램
		// 중복없이 오름차순

		Random rand = new Random();
		int[] lottos = new int[6];
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = rand.nextInt(45) + 1;
			for(int j =0; j<i; j++) {
				if(lottos[j]==lottos[i] {
					i--;  //이게 포인트 /중복될 경우 증가식과 만나서 같은 i값을 다시 뽑게됨.
					break;  //
				}
			}

			System.out.print(lottos[i] + " ");
		}

		// 오름차순 정렬

		int minIndex;
		for (int i = 0; i < lottos.length; i++) {
			minIndex = i;
			for (int j = i; j < lottos.length; j++) {
				if (lottos[minIndex] > lottos[j]) {
					minIndex = j;
				}
			}
			int temp = lottos[i];
			lottos[i] = lottos[minIndex];
			lottos[minIndex] = temp;
		}

		System.out.println();
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}

	}

}
