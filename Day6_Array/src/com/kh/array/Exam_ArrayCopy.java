package com.kh.array;

public class Exam_ArrayCopy {
	public static void main(String[] args) {
		int[] arrs1 = new int[4];
		for (int i = 0; i < arrs1.length; i++) {
			arrs1[i] = i + 1;
		}
		int[] arrs2 = arrs1; // ���� ����
		arrs2[0] = 5;
		System.out.println("==��������==");
		for (int i = 0; i < arrs1.length; i++) {
			System.out.printf("arrs1[%d] : %d \t arrs2[%d] : %d\n", i, arrs1[i], i, arrs2[i]);
		}

		int[] arrs3 = new int[4];
		for (int i = 0; i < arrs3.length; i++) {
			arrs3[i] = i + 1;
		}
		int[] arrs4 = new int[arrs3.length];
		//System.arraycopy�� �̿��� �迭�� ���� ����
		System.arraycopy(arrs3, 0, arrs4, 0, arrs3.length);
		//for���� �̿��� �迭�� ���� ���� , ���ǹ��� �߰��Ͽ� ����� ������ �߰��� �� �ִ�.
//		for(int i = 0; i<arrs3.length; i++) {
//			arrs4[i] = arrs3[i];
//		}
		
		
		arrs4[0] = 5;

		System.out.println("==��������==");
		for (int i = 0; i < arrs3.length; i++) {
			System.out.printf("arrs3[%d] : %d \t arrs4[%d] : %d\n", i, arrs3[i], i, arrs4[i]);
		}
	}
}
