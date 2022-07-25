package com.kh.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("inputStream.txt");  //checked exception -> try~catch 써야함
			int readByte;
			while(true) {
				readByte = is.read();  //checked exception  //read()는 값이 없으면 -1
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
