package com.kh.calculator.tutorver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {
	public static void main(String[] args) {
		int port = 4885;
		String host = "127.0.0.1";
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		String sendMsg = "";
		String recvMsg = "";
		int result = 0;
		
		try {
			socket = new Socket(host, port);
			System.out.println("계산기 서버에 연결하였습니다.");

			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			while(true) {
			System.out.print("계산식(빈칸으로 띄어 입력, 예 24+ 43 :");
			sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			if(sendMsg.equalsIgnoreCase("bye")) break;
			
			recvMsg = dis.readUTF();
			if(recvMsg.equalsIgnoreCase("bye")) break;
			System.out.println("계산결과 : " + recvMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
