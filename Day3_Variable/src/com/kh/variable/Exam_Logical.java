package com.kh.variable;

public class Exam_Logical {
	public static void main(String[] args) {
		System.out.println("논리연산자 예제");
		int a = 50;
		int b= 30;
		boolean result1,result2,result3,result4;
		
		result1 = (a != b) && (a < b);
		result2 = (a < b) || (a == b);
		result3 = (a > b) && (a != b);
		result4 = (a > b) || (a == b);
		
		System.out.println("result1 :" + result1);
		System.out.println("result2 :" + result2);
		System.out.println("result3 :" + result3);
		System.out.println("result4 :" + result4);
		
		
		System.out.println("논리연산자 예제2");
		
		a = 70;
		b = 55;
		
		// a==b || a++<100   70==55 or 75<100  ->true , a=71
		// a<b && --b<55   71<55 and 54<55 -> false, a=71, b=54
		// a!=b && b--<a++ 71!=54 and 54<71 -> true , a=72, b=53
		// a++!=b || b++>=85  72!=53 ||53>=85 ->true , a=73, b=54
		
		System.out.println("a :"+a + "  b :"+b);
		
		result1 = (a==b) || (a++<100);
		System.out.println("a : "+a + "  b : "+b +"  result1 :" + result1);
		
		result2 = (a<b) && (--b<55);
		System.out.println("a :"+a + "  b :"+b+"  result2 :" + result2);

		result3 = (a!=b) && (b--<a++);
		System.out.println("a :"+a + "  b :"+b+"  result3 :" + result3);

		result4 = (a++!=b) || (b++>=85);
		System.out.println("a :"+a + "  b :"+b+"  result4 :" + result4);
		
		
		
	}

}
