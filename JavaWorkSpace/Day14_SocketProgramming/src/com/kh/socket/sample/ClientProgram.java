package com.kh.socket.sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String[] args) {
		Socket socket = null;
		
		// 소켓 객체를 생성하는게 요청임
		
		try {
			System.out.println("연결요청");
			socket = new Socket("127.0.0.1", 4885); //host는 내 컴퓨터의 ip주소,
			System.out.println("연결 성공!!");
			//소켓이 만들어지면 연결이 성공됨
			
			
			/////데이터 보내기/////
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 완료");
			/////
			/////데이터 받기/////
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteNo = is.read(bytes);
			message =new String(bytes,0,readByteNo);
			System.out.println("데이터받기 성공: "+message);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
