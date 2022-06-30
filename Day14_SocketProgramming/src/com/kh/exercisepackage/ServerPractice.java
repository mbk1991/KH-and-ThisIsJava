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
			System.out.println("연결 대기중");
			socket = serverSocket.accept();
			System.out.println("연결 성공!");
			
			///데이터 받기
			
			is = socket.getInputStream();
			byte[] bytes = new byte[100];
			String message = "";
			int readByteNo = is.read(bytes);
			message = new String(bytes);
			
			System.out.println("수신 성공 : " + message);
			
			///응답 하기
			os = socket.getOutputStream();
			
			while(true) {
				
				System.out.println("채팅 입력");
				message = sc.nextLine();
				bytes = message.getBytes();
				
				System.out.println("응답 시도" + message);
				os.write(bytes);
				os.flush();
				
				System.out.println("응답 성공");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
