package chap5;

import java.util.Scanner;

public class Execise09 {
	// �л����� ������ �Է¹޾� �ְ� ���� �� ��������� ���ϴ� ���α׷�
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = sc.nextInt();
				System.out.println("���� �л��� : "+studentNum);
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				System.out.println("�����Է�> ");
				for(int i =0; i<studentNum; i++) {
					System.out.print("�л�"+(i+1)+"���� �Է�> ");
					scores[i] = sc.nextInt();
				}
				
			}else if(selectNo == 3) {
				System.out.println("��������Ʈ");
				for(int i=0; i<studentNum; i++) {
					System.out.printf("�л�%d : %d\n", i+1, scores[i]);
				}
		
			}else if(selectNo == 4) {
				int sum = 0;
				double avg =0.0;
				int max = 0;
				for(int i=0; i<studentNum; i++) {
					sum += scores[i];
				}
				for(int i =0; i<studentNum-1; i++) {
					if(scores[i]>=scores[i+1]) max = scores[i];
					else max = scores[i+1];
				}
				avg = (double) sum/studentNum;
				System.out.println("�ְ� ���� : " + max );
				System.out.println("��� ���� : " + avg);
				
			}else if(selectNo == 5) {
				run = false;
			}
	}
		System.out.println("���α׷� ����");
  }
}
