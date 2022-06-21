package com.kh.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int[][] arrs = new int[4][4];
		int k = 0;

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		// Ãâ·Â
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%5d", arrs[i][j]);
			}
			System.out.println();
		}

	}
}
