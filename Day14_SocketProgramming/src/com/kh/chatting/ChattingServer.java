package com.kh.chatting;

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

		String sendMsg = "";
		String recvMsg = "";

		int port = 4884;

		try {
			System.out.println("ä�ü����� ���� ���Դϴ�...");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");
			Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
			socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");

			is = socket.getInputStream();
			os = socket.getOutputStream();

			System.out.println("ä���� ���۵Ǿ����ϴ�.");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("����(��) : ");
				sendMsg = sc.nextLine();
				byte[] bytes = sendMsg.getBytes();
				os.write(bytes);
				/////
				bytes = new byte[100];
				int readByteNo = is.read(bytes);
				recvMsg = new String(bytes,0,readByteNo);
				System.out.println("Ŭ���̾�Ʈ(���) :" +recvMsg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
