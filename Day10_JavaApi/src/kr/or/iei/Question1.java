package kr.or.iei;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inputArray = new int[5];

		// ���� 5�� �Է�
		System.out.println("-----5���� ������ �Է¹޾� ��������-----");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d��° ���� �Է� : ", (i + 1));
			inputArray[i] = sc.nextInt();
		}

		// ��������

		for (int i = 0; i < inputArray.length - 1; i++) {

			for (int j = 0; j < (inputArray.length - 1) - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					int temp = inputArray[j + 1];
					inputArray[j + 1] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}

		// ���
		System.out.println("���ĵ� ��� :");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		System.out.println("\n���� �� ù��° ���� ������ ���� �� : " + (inputArray[0] + inputArray[4]));

		
	}
}
