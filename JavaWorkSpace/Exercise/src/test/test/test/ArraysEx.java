package test.test.test;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		
//		String[] arrInt = {"바나나","사과","수박","감자"};
//		int x = Arrays.asList(arrInt).indexOf("수박");
//		
//		System.out.println(x);
//		
//		String[] answers = new String[5];
//		
//		String answer = null;
//
//		byte[] tempByte = new byte[5];
//		
//		for(int i = 0; i < 5; i++) {
//			tempByte[5-1-i] = (byte)i;
//		}
//		
//		answer = new String(tempByte);
//		System.out.println(answer);
//		
//		String answer2 = "가나다라마바사아자차카";
//		System.out.println(answer2.charAt(5));
		
		String dart = "1D#2S*3S";
		
		dart = dart.replaceAll("\\*|\\#", "");
		System.out.println(dart);
		String[] darts = dart.split("S|D|T");
		String[] bonus = dart.split("");
		
		for(int i = 0; i < darts.length; i++) {
			System.out.println("darts"+i+" "+darts[i]);
			System.out.println("bonus"+i+" "+bonus[i]);
		}
		
		int a = (int) Math.pow(3,4);
		System.out.println(a);
		
	}
}
