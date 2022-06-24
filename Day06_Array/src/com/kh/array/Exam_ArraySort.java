package com.kh.array;

public class Exam_ArraySort {
	public static void main(String[] args) {
		//정렬
		// 1 3 4 2 5
		// 오름차순, 내림차순
		int num1 = 54;
		int num2 = 22;
		System.out.println("num1: " + num1 + " num2: " + num2);
		
		num1 = num1 + num2;  // num1 = 76 num2 = 22
		num2 = num1 - num2; // num1 =76 num2 = 54
		num1 = num1 - num2; // num1 = 22 num2 = 54
		
		System.out.println("num1: " + num1 + " num2: " + num2);
		//직관적이지 않음
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1: " + num1 + " num2: " + num2);
		//가능은 하나 직관적이지 않음
		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;
		
		
		System.out.println("num1: " + num1 + " num2: " + num2);
		System.out.println();
		
		int [] nums = {2,1,3};
		//-> 1,3,2
		int temp2 = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp2;
		
		for(int i =0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	
	}
}
