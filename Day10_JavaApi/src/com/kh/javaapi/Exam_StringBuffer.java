package com.kh.javaapi;

public class Exam_StringBuffer {
	public static void main(String[] args) {
		//StringBuffer : ���ڿ��� �������ִ� Ŭ����
		//String���� ���ڿ��� �������ִ� �޼ҵ� : concat
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");
		
		System.out.println("����� ���ڿ� : " + sb.toString());
		String result = "Hello" + " " + "Java"; 
		//�� ����� ������ StringBuffer�� ���� ������?
		
		StringBuffer stb = new StringBuffer().append("KH").append("Java Class").append(" Good");
		System.out.println(stb.toString());
	
		System.out.println(stb.substring(14));
		System.out.println(stb.delete(3, 14));
		
//		String data1 = sb.toString();
//		System.out.println(data1);
	}
}
