package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {
	public static void main(String [] args) {
		
		Reader reader = null;
		
		try {
			reader = new FileReader("filereader.txt");
			int readCharNo;  // �̻�뺯��
			char [] cbuf = new char[4];
			readCharNo = reader.read(cbuf, 3, 1); //�迭�� ���� ������ġ�� ������ ����
			for(int i = 0; i < cbuf.length; i++) {
				System.out.print(cbuf[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}