package com.kh.array;

public class Exam_SortBubble {
	public static void main(String[] args) {
		int[] arrs = { 6, 2, 3, 1, 4 };
		
		System.out.println("���� �� :");
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}

		for (int i = 0; i < arrs.length - 1; i++) {
			// �ȿ��ִ� ������ �ݺ�Ƚ���� ���� �����ؾ���
			for (int j = 0; j < (arrs.length - 1) - i; j++) {
				if (arrs[j] > arrs[j + 1]) {
					int temp = arrs[j + 1];
					arrs[j + 1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		
		System.out.println("\n���� �� :");
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
}
