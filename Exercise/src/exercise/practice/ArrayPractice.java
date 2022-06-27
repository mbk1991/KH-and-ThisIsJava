package exercise.practice;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�> ");
		String inputStr = sc.next();
		System.out.print("�˻��� �Է�> ");
		char inputChar = sc.next().charAt(0);

		byte[] byteArray = inputStr.getBytes();

		int count = 0;
		for (int i = 0; i < byteArray.length; i++) {
			if (byteArray[i] == inputChar) {
				count++;
			}
		}
		System.out.println("�Է��Ͻ� ���ڿ� " + inputStr + " ���� ã���ô� ���� " + inputChar + "��" + count + "���Դϴ�.");

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ��ȣ �Է� : ");
		String phoneNum = sc.next();
		char[] phoneNumArray = new char[phoneNum.length()];
		for (int i = 0; i < phoneNumArray.length; i++) {
			phoneNumArray[i] = phoneNum.charAt(i);
		}

		char[] copyPhoneNumArray = new char[phoneNumArray.length];

		System.arraycopy(phoneNumArray, 0, copyPhoneNumArray, 0, phoneNumArray.length);

		for (int i = 0; i < copyPhoneNumArray.length; i++) {
			if (i >= 4 && i <= 7) {
				System.out.print("*");
			} else {
				System.out.print(copyPhoneNumArray[i]);
			}
		}

	}
	
	public void practice3() {
		
		int[][] array = new int[15][11];
		int k = 1;
		
		for(int i = 0 ; i<array.length; i++) {
			for(int j = 0 ; j<array[i].length; j++) {
				array[i][j] = k;
				k++;
			}
		}
		for(int i = 0 ; i<array.length; i++) {
			for(int j = 0 ; j<array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
