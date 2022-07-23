package test.test.test;

import java.util.Arrays;

public class Note {

	public static void main(String[] args) {

		String s = "이것이 자바다";
		System.out.println((char)(s.charAt(0) - 32));
		s.replace(s.charAt(0), (char)(s.charAt(0)-32));
		System.out.println(s);
		s.replace(s.charAt(0), '저');
		System.out.println(s);
		
		byte[] byteArr = s.getBytes();
		String str = "abcd";
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		System.out.println((char)(str.charAt(0) -32));
		System.out.println((char)(str.charAt(1) +32));
		System.out.println('b'-'B');
		System.out.println((int)'B');
		System.out.println((int)'b');
		
		byte[] bArr = str.getBytes();
		bArr[0] = (byte) (bArr[0] - 32);
		bArr[2] = (byte) (bArr[2] -32);
		str = new String(bArr);
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);

	}
	
	public static void test() {
		
	}

}
