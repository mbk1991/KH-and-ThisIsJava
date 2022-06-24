package com.kh.array;

public class Exam_SortBubble {
	public static void main(String[] args) {
		int[] arrs = { 6, 2, 3, 1, 4 };
		
		System.out.println("정렬 전 :");
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}

		for (int i = 0; i < arrs.length - 1; i++) {
			// 안에있는 포문은 반복횟수가 점점 감소해야함
			for (int j = 0; j < (arrs.length - 1) - i; j++) {
				if (arrs[j] > arrs[j + 1]) {
					int temp = arrs[j + 1];
					arrs[j + 1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		
		System.out.println("\n정렬 후 :");
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
}
