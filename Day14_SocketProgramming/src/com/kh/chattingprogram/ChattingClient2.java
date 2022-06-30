package com.kh.chattingprogram;

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
		String host = "127.0.0.1";
		int port = 4885;

		byte[] bytes = null;
		String sendMessage = null;

		try {
			System.out.println("클라이언트2 연결시도");
			socket = new Socket(host, port);
			System.out.println("클라이언트2 연결 성공");

			os = socket.getOutputStream();
			bytes = new byte[100];

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("클라이언트2 : ");
				sendMessage = "2" + sc.nextLine();
				bytes = sendMessage.getBytes();
				os.write(bytes);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
