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
			System.out.println("채팅서버를 구동 중입니다...");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다.");
			Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");

			is = socket.getInputStream();
			os = socket.getOutputStream();

			System.out.println("채팅이 시작되었습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("서버(나) : ");
				sendMsg = sc.nextLine();
				byte[] bytes = sendMsg.getBytes();
				os.write(bytes);
				/////
				bytes = new byte[100];
				int readByteNo = is.read(bytes);
				recvMsg = new String(bytes,0,readByteNo);
				System.out.println("클라이언트(상대) :" +recvMsg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
