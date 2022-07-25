package com.kh.calculator.tutorver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class ClaculatorServer {
	public static void main(String[] args) {
		int port = 4885;
		String host = "127.0.0.1";
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		String sendMsg = "";
		String recvMsg = "";
		String result = "";
		String[] recvMsgArr = null;
		int[] nums = null;
		char[] operators = null;

		try {
			System.out.println("������ ��ٸ��� �ֽ��ϴ�..");
			serverSocket = new ServerSocket(port);
			socket = serverSocket.accept();
			System.out.println("����Ǿ����ϴ�..");

			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			while(true) {
				recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("bye")) break;
				System.out.println("���� �޽��� " + recvMsg);
				StringTokenizer st = new StringTokenizer(recvMsg, " ");
				if(st.countTokens() != 3) {
					System.out.println("�߸��Է��ϼ̽��ϴ�. ����˴ϴ�.");
					dos.writeUTF("end");
					break;
				}
				
				int num1 = Integer.parseInt(st.nextToken());
				String opCode = st.nextToken();
				int num2 = Integer.parseInt(st.nextToken());
	
				switch (opCode) {
				case "+":
					result = String.valueOf(num1 + num2);
					break;
				case "-":
					result = num1 - num2 + "";
					break;
				case "*":
					result = num1 * num2 + "";
					break;
				default:
					result = "error";
					break;
				}
				////////////////////////////////////
				dos.writeUTF(result);
				if(sendMsg.equalsIgnoreCase("bye")) break;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
