package chap4;

import java.util.Scanner;

public class Exercise07 {
	//while���� Scanner�� �̿�, ����,���,��ȸ,���� ����� �����ϴ� �ڵ� �ۼ�
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----");
			System.out.println("1.����| 2.���| 3.�ܰ�| 4.����");
			System.out.println("-----");
			System.out.print("����>");
			int input = sc.nextInt();
			switch(input) {
			case 1: 
				System.out.println("���� �޴�");
				System.out.print("�󸶸� �����ұ��?:");
				int deposit = sc.nextInt();
				balance += deposit;
				break;
			case 2:
				System.out.println("��� �޴�");
				System.out.print("�󸶸� ����ұ��?:");
				int withraw = sc.nextInt();
				balance -= withraw;
				break;
			case 3:
				System.out.println("�ܰ� Ȯ�� �޴�");
				System.out.println("�ܰ�: " + balance);
			case 4:
				run = false;
				break;
			default : System.out.println("1~4������ ������ �Է��ϼ���.");
			}
			
		}
		System.out.println("���α׷� ����");
	}
}
