package com.kh.array;

public class Exam_SortSelection {
	public static void main(String[] args) {
		int[] arrs = { 2, 5, 4, 1, 3 };
		int min = 0;  //가장 작을 때의 인덱스 값.
		//선택정렬, 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		//데이터의 양이 적을때 성능이 좋고 데이터의 양이 많을 때 급격한 성능 저하를 보임
		
		System.out.println("\n=====");
		for(int i=0; i<arrs.length; i++) {
		System.out.print(arrs[i] + " ");
		}
		
		for(int i = 0; i< arrs.length; i++) {
			min = i;   /// 가장 작은 인덱스 자리를 기준으로
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
