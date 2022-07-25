package com.kh.exercisepackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPractice {
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in); 
		
		try {
			serverSocket = new ServerSocket(9136);
			System.out.println("���� �����");
			socket = serverSocket.accept();
			System.out.println("���� ����!");
			
			///������ �ޱ�
			
			is = socket.getInputStream();
			byte[] bytes = new byte[100];
			String message = "";
			int readByteNo = is.read(bytes);
			message = new String(bytes);
			
			System.out.println("���� ���� : " + message);
			
			///���� �ϱ�
			os = socket.getOutputStream();
			
			while(true) {
				
				System.out.println("ä�� �Է�");
				message = sc.nextLine();
				bytes = message.getBytes();
				
				System.out.println("���� �õ�" + message);
				os.write(bytes);
				os.flush();
				
				System.out.println("���� ����");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
