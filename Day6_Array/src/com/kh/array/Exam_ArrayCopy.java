package com.kh.array;

public class Exam_ArrayCopy {
	public static void main(String[] args) {
		int[] arrs1 = new int[4];
		for (int i = 0; i < arrs1.length; i++) {
			arrs1[i] = i + 1;
		}
		int[] arrs2 = arrs1; // 얕은 복사
		arrs2[0] = 5;
		System.out.println("==얕은복사==");
		for (int i = 0; i < arrs1.length; i++) {
			System.out.printf("arrs1[%d] : %d \t arrs2[%d] : %d\n", i, arrs1[i], i, arrs2[i]);
		}

		int[] arrs3 = new int[4];
		for (int i = 0; i < arrs3.length; i++) {
			arrs3[i] = i + 1;
		}
		int[] arrs4 = new int[arrs3.length];
		//System.arraycopy를 이용한 배열의 깊은 복사
		System.arraycopy(arrs3, 0, arrs4, 0, arrs3.length);
		//for문을 이용한 배열의 깊은 복사 , 조건문을 추가하여 복사시 조건을 추가할 수 있다.
//		for(int i = 0; i<arrs3.length; i++) {
//			arrs4[i] = arrs3[i];
//		}
		
		
		arrs4[0] = 5;

		System.out.println("==깊은복사==");
		for (int i = 0; i < arrs3.length; i++) {
			System.out.printf("arrs3[%d] : %d \t arrs4[%d] : %d\n", i, arrs3[i], i, arrs4[i]);
		}
	}
}
