package com.kh.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_FileInputStream {
	public static void main(String[] args) {
		// Exam_FileInputStream.java 파일을 읽어들여서 console창에 출력해보세요!
		
		InputStream is = null;
		Reader reader = null;
		
		try {
			is = new FileInputStream("C:\\KHWorkSpace\\Day13_IOStream\\src\\com\\kh\\exercise\\Exam_FileInputStream.java");
//			reader = new FileReader("C:\\KHWorkSpace\\Day13_IOStream\\src\\com\\kh\\exercise\\Exam_FileInputStream.java");
			
			int dataByteNo;
			byte[] buf = new byte[100];
			String result = "";
			while((dataByteNo = is.read(buf)) != -1) {
				result += new String(buf,0,dataByteNo);
			}
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
