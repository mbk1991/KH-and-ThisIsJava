package com.kh.BaseballGame;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {
	public static void main(String[] args) {
		int port = 4885;
		String host = "127.0.0.1";
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);

		String sendMsg = null;
		String recvMsg = null;

		try {
			socket = new Socket(host, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");

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

			while (true) {
				System.out.print("--> ");
				sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);

				recvMsg = dis.readUTF();
				if (recvMsg.equals("exit")) {
					System.out.println("exit");
					break;
				}
				System.out.println(recvMsg);
				System.out.println("=====\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
