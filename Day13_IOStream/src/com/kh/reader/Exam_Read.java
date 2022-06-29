package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null; // ����Ʈ��� ��Ʈ���� ����Ŭ����(�߻�Ŭ����)
		Reader reader = null; // ���ڱ�� ��Ʈ���� ����Ŭ����(�߻�Ŭ����)

		try {
			reader = new FileReader("filereader.txt");
			int readData; // ���� ������ ����
//			while(true) {
//				readData = reader.read();
//				if(readData == -1) {
//					break;
//				}
			while ((readData = reader.read()) != -1) {
				System.out.print((char) readData); // ���ڰ� ������ ���ڷ� ����ؾ���. �����?
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
