package com.kh.array;

public class Exam_SortSelection {
	public static void main(String[] args) {
		int[] arrs = { 2, 5, 4, 1, 3 };
		int min = 0;  //���� ���� ���� �ε��� ��.
		//��������, �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		//�������� ���� ������ ������ ���� �������� ���� ���� �� �ް��� ���� ���ϸ� ����
		
		System.out.println("\n=====");
		for(int i=0; i<arrs.length; i++) {
		System.out.print(arrs[i] + " ");
		}
		
		for(int i = 0; i< arrs.length; i++) {
			min = i;   /// ���� ���� �ε��� �ڸ��� ��������
			for(int j = i+1; j<arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;
				}
			}
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
		}
		
		System.out.println("\n=====");
		for(int i=0; i<arrs.length; i++) {
		System.out.print(arrs[i] + " ");
		}
	}
}
