package test.test.test;

import java.util.Scanner;
import java.util.*;

public class TestCoding {
	public static void main(String[] args) {
		
		String str = "1+2+3-4*6";
		String con = "\\* | -";
		String[] strArr = str.split("\\* | -");
		for(String stra: strArr)
		System.out.println(stra);
		
		HashMap<Integer,Double> hashMap = new HashMap<>();
		hashMap.put(1, 0.1);
		hashMap.put(2,0.0);
		hashMap.put(3,0.45);
		
		
		
		
		System.out.println(hashMap);
		
		
		
//		Set<Integer> set = new HashSet<>();
//		int[] intArr = {1,2,2,6,4,3,6};
//		Arrays.asList(intArr);
//		
//		for(int i = 0; i < intArr.length; i++) {
//			set.add(intArr[i]);
//		}
//		
//		System.out.println(set);
		
		
//		char a = '가';
//		char b = '다';
//		char c = '나';
//		char d = 'a';
//		
//		System.out.println(a<b);
//		System.out.println(a<d);
////		
////		char[] charArray = new char[5];
////		int[] intArray = new int[5];
////		
////			System.out.print(charArray[0]);
//		
//		
//		//반복문 중에 엔터를 입력하면 조건문에 진입하도록 할 수 있을까?
//		// 입력하지 않는 것도 그냥 넘어가져야하는데 안 될 듯.
//		//char의 초기값을 이용하면 어떨까?
//		
//		
//		
//		System.out.println("이게 될까.");
//		
//		System.out.println(2^3);
//		
//		int n = 45;
//		int x = 1;
//		int len = 0;
//	
//		for(int i = 0; i < 45; i++) {
//		  x*=3;
//		  if(n<x) {
//			  System.out.println("i" +i);
//			  len = i;
//			  break;
//		  }	  		
//		  System.out.println(x);
//		}
//		String[] strArr = new String[len+1];
//		
//		x/=3;
//		EXIT:
//		for(int i = len; i>=0; i--) {
//			for(int j = 2; j>=0; j--) {
//				int temp = x*j;
//				System.out.println("temp"+temp);
//				if(n>=temp) {
//					n-=temp;
//					strArr[i] = Integer.toString(j);
//					if(n == 0) break EXIT;
//					break;
//				}
//			}
//			x/=3;
//		}
//		for(int i = 0; i<strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
//		
//		String tempStr;
//		
		
		
	}
}
