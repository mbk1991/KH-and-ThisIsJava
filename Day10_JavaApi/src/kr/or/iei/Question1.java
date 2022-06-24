package kr.or.iei;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inputArray = new int[5];

		// 정수 5개 입력
		System.out.println("-----5개의 정수를 입력받아 버블정렬-----");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번째 정수 입력 : ", (i + 1));
			inputArray[i] = sc.nextInt();
		}

		// 버블정렬

		for (int i = 0; i < inputArray.length - 1; i++) {

			for (int j = 0; j < (inputArray.length - 1) - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					int temp = inputArray[j + 1];
					inputArray[j + 1] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}

		// 출력
		System.out.println("정렬된 결과 :");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println("\n정렬 후 첫번째 수와 마지막 수의 합 : " + (inputArray[0] + inputArray[4]));

		
	}
}
