package com.kh.socket.sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		
		try {
			serverSocket = new ServerSocket(4885);
			System.out.println("연결 기다림...");
			Socket socket = serverSocket.accept();  //Socket객체를 반환함.
			System.out.println("연결 수락됨!!");
			
			/////데이터 받기/////
			byte[] bytes = null;
			String message = null;
			
			is = socket.getInputStream();
			bytes = new byte[100];
			int readByteNo = is.read(bytes);
			System.out.println("readBYteNo" +readByteNo);
			message = new String(bytes,0,readByteNo);
			System.out.println("데이터받기 성공: " +message);
			/////
			/////데이터 보내기/////
			OutputStream os = socket.getOutputStream();
			message = "Hello Client";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 보내기 성공");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
}
