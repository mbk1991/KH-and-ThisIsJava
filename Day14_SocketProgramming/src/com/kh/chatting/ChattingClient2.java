package com.kh.chatting;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient2 {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = null;

		int port = 4884;
		String address = "127.0.0.1";
		String sendMsg = "";
		String recvMsg = "";

		try {
			System.out.println("������ �������Դϴ�.");
			socket = new Socket(address, port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");

			is = socket.getInputStream();
			os = socket.getOutputStream();

			System.out.println("�������� ä���� �����մϴ�.");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc = new Scanner(System.in);
		while (true) {
			try {
				byte[] bytes = new byte[100];
				int readByteNo = is.read(bytes);
				recvMsg = new String(bytes, 0, readByteNo);
				System.out.println("����(���) : " + recvMsg);
				/////
				System.out.print("Ŭ���̾�Ʈ(��) : ");
				sendMsg = sc.nextLine();
				bytes = sendMsg.getBytes();
				os.write(bytes);
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
