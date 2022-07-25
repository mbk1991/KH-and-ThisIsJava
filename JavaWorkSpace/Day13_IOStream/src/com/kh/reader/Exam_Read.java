package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null; // 바이트기반 스트림의 조상클래스(추상클래스)
		Reader reader = null; // 문자기반 스트림의 조상클래스(추상클래스)

		try {
			reader = new FileReader("filereader.txt");
			int readData; // 읽은 데이터 저장
//			while(true) {
//				readData = reader.read();
//				if(readData == -1) {
//					break;
//				}
			while ((readData = reader.read()) != -1) {
				System.out.print((char) readData); // 숫자가 나오나 문자로 출력해야함. 방법은?
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
