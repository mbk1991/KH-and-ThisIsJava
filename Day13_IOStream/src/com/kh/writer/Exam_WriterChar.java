package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterChar {
	public static void main(String[] args) {
		Writer writer = null;

		try {
			writer = new FileWriter("outputStream.txt");
			char[] data = "이것이 자바임".toCharArray();
			writer.write(data);   //for문을 사용하지 않아도 됨.
			writer.flush();
			System.out.println("write(char[]) 메소드 쓰기 완료!!"); //결과 확인용 메시지

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
