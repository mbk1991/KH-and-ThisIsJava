package com.kh.exercise;
import java.util.Scanner;

public class Exercise_Triple2 {
	// �� ���� '+' �Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�
	// ��, '+', '-' �̿��� ������ �Է½� "�߸��Է��ϼ̽��ϴ�!" ���

	// ù��° �� : 6
	// �ι�° �� : 12
	// ������ �Է�(+ or -) : +
	// ��� : 18

	// ù��° �� : 6
	// �ι�° �� : 12
	// ������ �Է�(+ or -) : -
	// ��� : -6

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("�� ���� '+','-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ù��° �� �Է� : ");
			int input1 = sc.nextInt();
			
			System.out.print("'+' �Ǵ� '-' �Է� :" );
			char operator = sc.next().charAt(0);
			
			System.out.print("�ι�° �� �Է� : ");
			int input2 = sc.nextInt();
					
			String result = ((operator == '+') || (operator == '-')) ? ((operator == '+') ? "��� :" + (input1 + input2): "��� :" +(input1 - input2)): "�߸� �Է��ϼ̽��ϴ�!";
			
			System.out.println(result);
		}
	}

}
