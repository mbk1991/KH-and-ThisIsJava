package com.kh.array;

public class Exam_SortInsertion {
	public static void main(String[] args) {

		int[] numArray = { 3, 1, 43, 23, 3, 1 };

		for (int i = 1; i < numArray.length; i++) {
			for (int j = (i - 1); j >= 0; j--) {
				if (numArray[j + 1] < numArray[j]) {
					int temp = numArray[j + 1];
					numArray[j + 1] = numArray[j];
					numArray[j] = temp;
				}
			}
		}

		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");

		}
	}
}