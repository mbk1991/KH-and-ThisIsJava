package test.test.test;

import java.util.ArrayList;
import java.util.Arrays;

public class StringTest {
	public static void main(String[] args) {
		
		
		
		
		String a = "abcde";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<5; i++) {
			sb.append("*");
		}
		System.out.println(sb.toString());
		
		System.out.println(123/100);
		System.out.println(123/10);
		System.out.println(123/1);
	
		String[] strArr = {"abc","sbc","dcd"};
		Arrays.sort(strArr);
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
//		
//		System.out.println(a.substring(2, 3));
//		System.out.println(a.substring(1, 3));
//		
//		String b = "1,2,,3,4,5";
//		String[] arrB = b.split(",");
//		
//		for(int i = 0 ; i < arrB.length; i ++)
//		System.out.println(arrB[i]);
//		
//		ArrayList<Integer> arrList = new ArrayList<>();
//		
////		Integer[] arr = (Integer[])arrList.toArray();
//		
//		int[] array = {1,2,3,4,5};
//		int[] array2 = Arrays.copyOfRange(array, 0, 2);
//		
//		for(int i=0; i<array2.length; i++) {
//			System.out.println(array2[i]);
//		}
		
		
		
	}
}
