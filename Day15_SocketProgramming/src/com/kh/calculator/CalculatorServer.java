package com.kh.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
//////SOCKET통신으로 //클라이언트에서 입력하는 값들을 계산하여 되돌려주는 프로그램.
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
		String[] recvMsgArr = null;
		int[] nums = null;
		char[] operators = null;


		try {
			System.out.println("연결을 기다리고 있습니다..");
			serverSocket = new ServerSocket(port);
			socket = serverSocket.accept();
			System.out.println("연결되었습니다..");

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
				System.out.println("입력된 문자열 : " + recvMsg);
	
				recvMsgArr = recvMsg.split(" ");
				if(recvMsgArr.length < 3) {
					System.out.println("잘못 입력하였습니다.");
					dos.writeUTF("end");
					continue;
				}
				
				
				nums = new int[recvMsgArr.length];
				operators = new char[recvMsgArr.length];
	
				for (int i = 0; i < recvMsgArr.length; i++) {
					try {
						nums[i] = Integer.parseInt(recvMsgArr[i]);
					} catch (NumberFormatException e) {
						operators[i] = recvMsgArr[i].charAt(0);
					}
				}
				String resultString = calculator(nums, operators);
				System.out.println(resultString);
	
				dos.writeUTF(resultString);
				if(resultString.equalsIgnoreCase("bye")) break;
			}

		} catch (IOException e) {
			e.printStackTrace();

		}

		System.out.println("종료");

		try {
			dis.close();
			dos.close();
			os.close();
			is.close();
			serverSocket.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String calculator(int[] nums, char[] operators) {

		/// operator 1

		int result = nums[0];
		String resultString = null;

		for (int i = 0; i < nums.length - 1; i++) {
			switch (operators[i]) {
			case '+':
				result += nums[i + 1];
				resultString = result+"";
				break;
			case '-':
				result -= nums[i + 1];
				resultString = result+"";
				break;
			case '*':
				result *= nums[i + 1];
				resultString = result+"";
				break;
			case '/':
				result /= nums[i + 1];
				resultString = result+"";
				break;
			case '%':
				result %= nums[i + 1];
				resultString = result+"";
				break;
			default:
				resultString = "error";
				break;
			}
		}
		return resultString;
	}
}
