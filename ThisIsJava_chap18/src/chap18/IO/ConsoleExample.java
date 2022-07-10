package chap18.IO;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("아이디: ");
		String id = console.readLine();
		
		System.out.print("패스워드: ");
//		char[] charPass = console.readpassword();
//		String strPassword = new String(charPass);   //char배열을 문자열로 생성
		
		System.out.println("==========");
		System.out.println(id);
//		System.out.println(strPassword);
	}
}
