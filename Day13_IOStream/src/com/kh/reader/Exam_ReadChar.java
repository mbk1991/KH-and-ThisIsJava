package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("filereader.txt");
			int readCharNo;
			char[] cbuf = new char[2];
			String data = "";
			while ((readCharNo = reader.read(cbuf)) != -1) {
				data += new String(cbuf, 0, readCharNo); // 배열을 문자열로 바꾸는 String생성자
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
