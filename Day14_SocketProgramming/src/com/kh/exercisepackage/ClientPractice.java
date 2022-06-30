package com.kh.exercisepackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientPractice {
	public static void main(String[] args) {
		
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		
		try {
			System.out.println("���� �õ�");
			socket = new Socket("127.0.0.1", 9136);
			System.out.println("���� ����");
			
			///������ ������
			
			os = socket.getOutputStream();
			
			byte[] bytes = null;
			String message = null;
			message = "testRequest";
			bytes = message.getBytes();
			System.out.println("����");
			os.write(bytes);
			os.flush();
			System.out.println("���� ����");
			
			///������ ����
			
			is = socket.getInputStream();
			bytes = new byte[100];
			
			is.read(bytes);
			message = new String(bytes);
			
			System.out.println("���� ���� : " + message);
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
