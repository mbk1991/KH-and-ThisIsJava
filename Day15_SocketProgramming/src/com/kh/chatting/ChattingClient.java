package com.kh.chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
	public static void main(String[] args) {
		Socket socket = null;
		String host = "127.0.0.1";
		int port = 8999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		String sendMsg = "";
		String recvMsg = "";
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("서버에 연결중입니다.");
			socket = new Socket(host, port);
			System.out.println("채팅서버에 접속하였습니다.");

			// 소켓에서 스트림 객체를 뽑아냄
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

				recvMsg = dis.readUTF();
				if(recvMsg.equals("exid")) break;
				System.out.println("서버(상대): " + recvMsg);

				System.out.print("클라이언트(나): ");
				sendMsg = sc.nextLine();
				if (sendMsg.equals("exid"))break;
				dos.writeUTF(sendMsg);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("채팅서버를 종료합니다.");
		}
	}
}
