package com.kh.chattingprogram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = null;
/////////////������ ä�ù����� ���� read�� ����ϰ�
		//// Ŭ���̾�Ʈ 1�� Ŭ���̾�Ʈ 2�� �����Ͽ�
		/// Ŭ���̾�Ʈ�� write�� �ϴ� ����� ������ �õ�������
		//// Ŭ���̾�Ʈ 2�� ���� �������� ����.
		/// �ܹ��� �Ǵ� �����ư��鼭 ������ �ƴ� ���� ä�ð���
		///������ �Ϸ���?
		// ������ ������ �ϳ� �� �����? �� ���� �� �������ϹǷ� �����ε�.
		
		
		int port = 4885;
		byte[] bytes = null;
		String receiveMessage = null;
		String clientName = null;

		try {
			System.out.println("�������ϻ���");
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ ���� ���");
			socket = serverSocket.accept();
			System.out.println("���� ����");
			
			
			is = socket.getInputStream();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		while(true) {
		try {
				bytes = new byte[100];
				int readByteNo;
				readByteNo = is.read(bytes);
				receiveMessage = new String(bytes);
				int check = receiveMessage.charAt(0);
				if(check=='1') clientName = "Client1";
				if(check=='2') clientName = "Client2";
				receiveMessage = receiveMessage.substring(1);
	
				System.out.println(clientName+ " : " + receiveMessage);
				////////////////////////////
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
