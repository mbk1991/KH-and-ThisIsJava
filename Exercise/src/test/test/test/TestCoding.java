package test.test.test;

import java.util.Scanner;

public class TestCoding {
	public static void main(String[] args) {
//		
//		char[] charArray = new char[5];
//		int[] intArray = new int[5];
//		
//			System.out.print(charArray[0]);
		
		
		//�ݺ��� �߿� ���͸� �Է��ϸ� ���ǹ��� �����ϵ��� �� �� ������?
		// �Է����� �ʴ� �͵� �׳� �Ѿ�����ϴµ� �� �� ��.
		//char�� �ʱⰪ�� �̿��ϸ� ���?
		
		Scanner sc = new Scanner(System.in);
		char input= '\u0000';
		
		while(input == '\u0000') {
			System.out.println("���ѹݺ��� ��");
			
			input = sc.next().charAt(0);
			
		}
		
		System.out.println("�̰� �ɱ�.");
		
	}
}
