package chap18.IO;

import java.io.InputStream;

public class SystemInExample1 {
	public static void main(String[] args) throws Exception {
		System.out.println("==�޴�==");
		System.out.println("1.���� ��ȸ");
		System.out.println("2.���� ���");
		System.out.println("3.���� �Ա�");
		System.out.println("4.����");
		System.out.print("�޴��� �����ϼ���: ");
		
		InputStream is = System.in;

		while(true) {
			int inputChar = is.read();
			System.out.println("inputChar " +inputChar);
			System.out.println("(char) inputChar " + (char)inputChar);
			
			switch((char) inputChar) {
			case '1':
				System.out.println("���� ��ȸ�� �����ϼ̽��ϴ�.");
				break;
			case '2':
				System.out.println("���� ��ݸ� �����ϼ̽��ϴ�.");
				break;
			case '3':
				System.out.println("���� �Աݸ� �����ϼ̽��ϴ�.");
				break;
			case '4':
				System.out.println("���Ḧ �����ϼ̽��ϴ�.");
				break;
			}
		}
	}
}
