package chap18.IO;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("���̵�: ");
		String id = console.readLine();
		
		System.out.print("�н�����: ");
//		char[] charPass = console.readpassword();
//		String strPassword = new String(charPass);   //char�迭�� ���ڿ��� ����
		
		System.out.println("==========");
		System.out.println(id);
//		System.out.println(strPassword);
	}
}
