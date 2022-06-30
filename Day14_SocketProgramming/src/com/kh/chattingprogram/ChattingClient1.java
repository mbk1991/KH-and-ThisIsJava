package com.kh.chattingprogram;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient1 {
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
			System.out.println("Ŭ���̾�Ʈ1 ����õ�");
			socket = new Socket(host, port);
			System.out.println("Ŭ���̾�Ʈ1 ���� ����");

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
				System.out.print("Ŭ���̾�Ʈ1 : ");
				sendMessage = "1" + sc.nextLine();
				bytes = sendMessage.getBytes();
				os.write(bytes);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
