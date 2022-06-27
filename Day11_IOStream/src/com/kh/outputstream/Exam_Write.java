package com.kh.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
 public static void main(String[] args) {
	 OutputStream os = null;
	 
	 
	 try {
		os = new FileOutputStream("outputStream.txt");//스트림을연다
		byte[] data = "Hello I/O".getBytes();	//문자열을 byte배열로 만든다
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]); //os객체에 값을 입력. 그런데 data[i]는 byte인데 어떻게 문자로나오지?
		} //for문을 쓰지 않고 write()메소드에 byte배열을 넣을 수 있음.
		os.flush();  //씻어내다는 뜻. os객체에 write된 값을 지워주는 역할인듯
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
 }
}
