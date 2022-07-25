package com.kh.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
 public static void main(String[] args) {
	 OutputStream os = null;
	 
	 
	 try {
		os = new FileOutputStream("outputStream.txt");//��Ʈ��������
		byte[] data = "Hello I/O".getBytes();	//���ڿ��� byte�迭�� �����
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]); //os��ü�� ���� �Է�. �׷��� data[i]�� byte�ε� ��� ���ڷγ�����?
		} //for���� ���� �ʰ� write()�޼ҵ忡 byte�迭�� ���� �� ����.
		os.flush();  //�ľ�ٴ� ��. os��ü�� write�� ���� �����ִ� �����ε�
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
 }
}
