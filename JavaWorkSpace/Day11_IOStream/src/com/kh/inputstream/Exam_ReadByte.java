package com.kh.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
 public static void main(String[] args) {
	 InputStream is = null;
	 
	 try {
		is = new FileInputStream("inputStream.txt");
		int readByteNo;   //읽은 바이트 개수를 리턴
		
		byte[] readBytes = new byte[5];
		String data = "";
		
		while(true) {
			readByteNo = is.read(readBytes);  //읽은 값은 배열에 저장, 읽어온 갯수는 변수에 저장.
			System.out.println(readByteNo);
			if(readByteNo == -1) break;
			data += new String(readBytes,1,2);
			System.out.println(data);
		}
		System.out.println(data);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
}
