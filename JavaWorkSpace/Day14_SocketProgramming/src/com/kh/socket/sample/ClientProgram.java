package com.kh.socket.sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String[] args) {
		Socket socket = null;
		
		// ���� ��ü�� �����ϴ°� ��û��
		
		try {
			System.out.println("�����û");
			socket = new Socket("127.0.0.1", 4885); //host�� �� ��ǻ���� ip�ּ�,
			System.out.println("���� ����!!");
			//������ ��������� ������ ������
			
			
			/////������ ������/////
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			/////
			/////������ �ޱ�/////
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteNo = is.read(bytes);
			message =new String(bytes,0,readByteNo);
			System.out.println("�����͹ޱ� ����: "+message);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
