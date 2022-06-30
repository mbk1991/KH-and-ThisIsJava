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
/////////////서버를 채팅방으로 쓰고 read만 대기하고
		//// 클라이언트 1과 클라이언트 2가 접속하여
		/// 클라이언트는 write만 하는 방식의 구현을 시도했으나
		//// 클라이언트 2의 말은 전해지지 않음.
		/// 단방향 또는 번갈아가면서 전송이 아닌 실제 채팅같은
		///구현을 하려면?
		// 서버에 소켓을 하나 더 만든다? 다 각각 더 만들어야하므로 별로인듯.
		
		
		int port = 4885;
		byte[] bytes = null;
		String receiveMessage = null;
		String clientName = null;

		try {
			System.out.println("서버소켓생성");
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트 연결 대기");
			socket = serverSocket.accept();
			System.out.println("연결 성공");
			
			
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
