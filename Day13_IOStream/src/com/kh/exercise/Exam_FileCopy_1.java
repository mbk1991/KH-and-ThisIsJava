package com.kh.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy_1 {
	public static void main(String[] args) {
		// �̹��� ���� ����
		// ������ ��δ� C:\\temp\\xxx.png
		// ���� ���� �� ���� ���� ����
		// ������ ���
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:\\temp2\\image1.png");
			os = new FileOutputStream("C:\\temp3\\copyImage1.png");
			int readByteNo;
			byte[] readBytes = new byte[100];
			while ((readByteNo = is.read(readBytes)) != -1) {
				// ���⿡ ���� �ڵ尡 �ʿ���.
				os.write(readBytes);
			}
			os.flush();
			System.out.println("�۾� �Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
