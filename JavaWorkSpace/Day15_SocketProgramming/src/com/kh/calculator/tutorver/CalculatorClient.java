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
			System.out.println("���� ������ �����Ͽ����ϴ�.");

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
			System.out.print("����(��ĭ���� ��� �Է�, �� 24+ 43 :");
			sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			if(sendMsg.equalsIgnoreCase("bye")) break;
			
			recvMsg = dis.readUTF();
			if(recvMsg.equalsIgnoreCase("bye")) break;
			System.out.println("����� : " + recvMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
