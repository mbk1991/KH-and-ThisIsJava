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
			System.out.println("서버에 연결중입니다.");
			socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다.");

			is = socket.getInputStream();
			os = socket.getOutputStream();

			System.out.println("서버와의 채팅을 시작합니다.");

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
				System.out.println("서버(상대) : " + recvMsg);
				/////
				System.out.print("클라이언트(나) : ");
				sendMsg = sc.nextLine();
				bytes = sendMsg.getBytes();
				os.write(bytes);
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
