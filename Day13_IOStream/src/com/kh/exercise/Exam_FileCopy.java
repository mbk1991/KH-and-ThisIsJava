package com.kh.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {
	public static void main(String[] args) {
		//이미지 파일 복사
		//파일의 경로는 C:\\temp\\xxx.png
		//파일 읽은 후 읽은 값을 쓰기
		//복사할 경로
		
		InputStream is = null;
		String data = "";
		
		try {
			is = new FileInputStream("c:\\temp2\\image1.png");
			byte[] dataByteNo = new byte[10000];
			int dataNo;
			
			while((dataNo = is.read(dataByteNo)) != -1) {
				data += new String(dataByteNo,0,dataNo);
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("c:\\temp3\\copiedImage1.png");
			byte[] dataByteNo = data.getBytes();
			os.write(dataByteNo);
			os.flush();
			
			
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
