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
			System.out.println("������ �������Դϴ�.");
			socket = new Socket(host, port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");

			// ���Ͽ��� ��Ʈ�� ��ü�� �̾Ƴ�
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
				System.out.println("����(���): " + recvMsg);

				System.out.print("Ŭ���̾�Ʈ(��): ");
				sendMsg = sc.nextLine();
				if (sendMsg.equals("exid"))break;
				dos.writeUTF(sendMsg);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("ä�ü����� �����մϴ�.");
		}
	}
}
