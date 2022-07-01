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
		DataInputStream dis = null; // 보조스트림. is 대신 이 객체를 쓸 예정
		DataOutputStream dos = null; // os대신 이 객체를 쓸 예정.

		String sendMsg = "";
		String recvMsg = "";
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("채팅서버를 구동중입니다...");
			Thread.sleep(2000);
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다.");
			Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");

			// 소켓에서 스트림 객체를 뽑아냄
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is); // 주스트림을 넣어 보조스트림객체를 생성
			dos = new DataOutputStream(os); // 주스트림을 매개변수로 보조스트림객체 생성

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			
			while(true) {
				System.out.print("서버(나): ");
				sendMsg = sc.nextLine();
				if(sendMsg.equals("exid")) break;
				dos.writeUTF(sendMsg);
				
				recvMsg = dis.readUTF();
				if(recvMsg.equals("exid")) break; 
				System.out.println("클라이언트(상대): "+recvMsg);
					
				
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("채팅서버를 종료합니다.");
		}
	}
}
