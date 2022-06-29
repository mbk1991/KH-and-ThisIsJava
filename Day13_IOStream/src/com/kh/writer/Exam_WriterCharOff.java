package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterCharOff {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("outputStream.txt");
			char[] cbuf = "자바는 커피임".toCharArray();
			writer.write(cbuf, 0, 7);
			writer.flush();
			System.out.println("쓰기 완료");
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
