package com.kh.exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Exercise_IOStream {
	public static void main(String[] args) {
//		������ ���ϸ� �Է� : khtext.txt
//		khtext.txt ���Ͽ� ����� �����Է�
//		����� exit
//		1:1111
//		2:tdsaf
//		3:good
//		4:gogoogo
//		5:exit �Է� �� (exit�� �����ϰ� ���� �����)

		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		System.out.print("txt������ �̸��� �Է��ϼ���");
		String fileName = sc.next();
		sc.nextLine();
		try {
			os = new FileOutputStream("c:\\temp3\\" + fileName + ".txt");
			System.out.println(fileName + "�� ����� ������ �Է� >");
			System.out.println("(exit �Է� �� ����");
			int lineNumber = 1;
			while (true) {
				System.out.print(lineNumber++ + " : ");
				// lineNumber++;
				String content = sc.nextLine(); // String���ڿ��� �Է¹޾���
				if (content.equals("exit")) { // �Է¹��� ���� exit�� ���ٸ� ����
					System.out.println("����!");
					break;
				}
				byte[] byteBuffer = content.getBytes(); // String�� byte�迭�� ����
				os.write(byteBuffer); // write()�޼ҵ�� ���Ͽ� ����
				os.write(13); // ������ �ƽ�Ű�ڵ�� ���� �ۼ�

			}
			os.flush(); // ��Ʈ���� �����
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
