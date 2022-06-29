package com.kh.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy_1 {
	public static void main(String[] args) {
		// 이미지 파일 복사
		// 파일의 경로는 C:\\temp\\xxx.png
		// 파일 읽은 후 읽은 값을 쓰기
		// 복사할 경로
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:\\temp2\\image1.png");
			os = new FileOutputStream("C:\\temp3\\copyImage1.png");
			int readByteNo;
			byte[] readBytes = new byte[100];
			while ((readByteNo = is.read(readBytes)) != -1) {
				// 여기에 쓰기 코드가 필요함.
				os.write(readBytes);
			}
			os.flush();
			System.out.println("작업 완료");
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
