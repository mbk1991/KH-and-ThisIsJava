package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Writer {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("outputStream.txt"); // ��Ʈ���� ����.
			char[] data = "�̰Ž� �ڹٴ�".toCharArray(); // ���ڿ��� ���� �迭�� �����.
			for (int i = 0; i < data.length; i++) {
				writer.write(data[i]); // �迭�� ���̱��� �ݺ� ������
			}
			writer.flush(); // ��Ʈ���� ����� ���⸦ �Ϸ�
			System.out.println("���� �Ϸ�"); // �ܼ� ��¿�

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
