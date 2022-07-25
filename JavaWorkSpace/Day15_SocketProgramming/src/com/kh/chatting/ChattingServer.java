package com.kh.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
		int port = 8999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null; // ������Ʈ��. is ��� �� ��ü�� �� ����
		DataOutputStream dos = null; // os��� �� ��ü�� �� ����.

		String sendMsg = "";
		String recvMsg = "";
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("ä�ü����� �������Դϴ�...");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");
			Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
			socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");

			// ���Ͽ��� ��Ʈ�� ��ü�� �̾Ƴ�
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is); // �ֽ�Ʈ���� �־� ������Ʈ����ü�� ����
			dos = new DataOutputStream(os); // �ֽ�Ʈ���� �Ű������� ������Ʈ����ü ����

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			
			while(true) {
				System.out.print("����(��): ");
				sendMsg = sc.nextLine();
				if(sendMsg.equals("exid")) break;
				dos.writeUTF(sendMsg);
				
				recvMsg = dis.readUTF();
				if(recvMsg.equals("exid")) break; 
				System.out.println("Ŭ���̾�Ʈ(���): "+recvMsg);
					
				
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("ä�ü����� �����մϴ�.");
		}
	}
}
