package com.kh.array;

public class Exam_Array2 {
	public static void main(String[] args) {

		int[][]arr =new int[4][4];
		int k =1;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j < arr.length; j++){
				arr[i][j] = k;
				k++;
				System.out.print(arr[i][j]+ "\t");
				
			}
			System.out.println();
		}
			
	
}
}