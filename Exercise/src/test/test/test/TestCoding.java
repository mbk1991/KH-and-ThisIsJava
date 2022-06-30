package test.test.test;

import java.util.Scanner;

public class TestCoding {
	public static void main(String[] args) {
//		
//		char[] charArray = new char[5];
//		int[] intArray = new int[5];
//		
//			System.out.print(charArray[0]);
		
		
		//반복문 중에 엔터를 입력하면 조건문에 진입하도록 할 수 있을까?
		// 입력하지 않는 것도 그냥 넘어가져야하는데 안 될 듯.
		//char의 초기값을 이용하면 어떨까?
		
		Scanner sc = new Scanner(System.in);
		char input= '\u0000';
		
		while(input == '\u0000') {
			System.out.println("무한반복의 늪");
			
			input = sc.next().charAt(0);
			
		}
		
		System.out.println("이게 될까.");
		
	}
}
