package com.kh.exercise;

import java.util.Scanner;

public class Exercise_DimArray {
	public void exercise1() {

		int[][] nums = new int[5][5];
		int k = 1;

		for (int i = 0; i < nums.length; i++) {
			// j인덱스; 4,3,2,1,0
			for (int j = nums[i].length - 1; j >= 0; j--) {
				nums[i][j] = k;
				k++;
			}
		}

		// 출력
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.printf("%3d\t", nums[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise2() {

		int[][] nums = new int[5][5];
		int k = 1;

		// 4,0 3,0 2,0 1,0 0,0 4,1 3,1 2,1 1,1 0,0
		for (int j = 0; j < nums.length; j++) {
			for (int i = nums.length - 1; i >= 0; i--) {
				nums[i][j] = k;
				k++;
			}
		}

		// 출력
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.printf("%3d\t", nums[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise3() {

		int[][] nums = new int[5][5];
		int k = 1;

		for (int j = 0; j < nums.length; j++) {
			for (int i = 0; i < nums.length; i++) {
				nums[i][j] = k;
				k++;
			}
		}

		// 출력
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.printf("%3d\t", nums[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise4() {

		int[][] nums = new int[5][5];
		int k = 1;

		// 0,0 0,1 0,2 0,3 0,4
		// 1,4 1,3 1,2 1,1 1,0

		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < nums[i].length; j++) {
					nums[i][j] = k;
					k++;
				}
			} else {
				for (int j = nums[i].length - 1; j >= 0; j--) {
					nums[i][j] = k;
					k++;
				}

			}
		}

		// 출력
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.printf("%3d\t", nums[i][j]);
			}
			System.out.println();
		}
	}

	public void exerciseTry() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행렬의 크기 입력 n*n 정사각형 >");
		int input = sc.nextInt();

		int[][] nums = new int[input][input];
		int k = 1;

		int iStart = 0;
		int iEnd = nums.length - 1;

		int jStart = 0;
		int jEnd = nums[0].length - 1;

		while (k < input * input + 1) {
			// 오른쪽으로
			for (int j = jStart; j <= jEnd; j++) {
				nums[iStart][j] = k;
				k++;
			}
			iStart++;
			// 아래로
			for (int i = iStart; i <= iEnd; i++) {
				nums[i][jEnd] = k;
				k++;
			}
			jEnd--;
			// 왼쪽으로
			for (int j = jEnd; j >= jStart; j--) {
				nums[iEnd][j] = k;
				k++;
			}
			iEnd--;
			// 위로
			for (int i = iEnd; i >= iStart; i--) {
				nums[i][jStart] = k;
				k++;
			}
			jStart++;
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.printf("%2d\t", nums[i][j]);
			}
			System.out.println();
		}
	}

}
