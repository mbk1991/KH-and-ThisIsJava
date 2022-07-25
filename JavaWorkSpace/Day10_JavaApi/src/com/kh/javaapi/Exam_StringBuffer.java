package com.kh.javaapi;

public class Exam_StringBuffer {
	public static void main(String[] args) {
		//StringBuffer : 문자열을 연결해주는 클래스
		//String에서 문자열을 연결해주는 메소드 : concat
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");
		
		System.out.println("연결된 문자열 : " + sb.toString());
		String result = "Hello" + " " + "Java"; 
		//와 결과가 같은데 StringBuffer를 쓰는 이유는?
		
		StringBuffer stb = new StringBuffer().append("KH").append("Java Class").append(" Good");
		System.out.println(stb.toString());
	
		System.out.println(stb.substring(14));
		System.out.println(stb.delete(3, 14));
		
//		String data1 = sb.toString();
//		System.out.println(data1);
	}
}
