package com.kh.BaseballGame;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.StringTokenizer;

public class BaseballServer {
	public static void main(String[] args) {
		int port = 4885;
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Random rand = new Random();
		StringTokenizer st = null;

		int randNum1 = 0;
		int randNum2 = 0;
		int randNum3 = 0;
		int[] randNums = new int[3];
		int[] recvNums = new int[3];
		String baseballNumber = null;

		String sendMsg = null;
		String recvMsg = null;

		int countStrike = 0;
		int countBall = 0;

		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다립니다.");
			socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");

			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			// 랜덤 숫자 생성, 중복없이 randNums배열에 저장
			int i = 0;
			randNums[i] = rand.nextInt(10);
			for (i = 1; i < 3; i++) {
				randNums[i] = rand.nextInt(10);
				for (int j = 0; j < i; j++) {
					if (randNums[i] == randNums[j]) {
						j--;
						continue;
					}
				}
			}

			// 서버의 숫자를 표시
			System.out.print("서버 숫자 --->");
			for (int k = 0; k < 3; k++) {
				System.out.print(randNums[k] + " ");
			}

			while (true) {
				// 입력받은 문자열 배열에 저장.
				recvMsg = dis.readUTF();
				System.out.println("받은 문자열 :" + recvMsg);
				st = new StringTokenizer(recvMsg, " ");
				if (st.countTokens() != 3) {
					dos.writeUTF("잘못입력하였습니다.");
					continue;
				}

				// 받은 문자열을 int배열에 담기
				for (int j = 0; j < recvNums.length; j++) {
					recvNums[j] = Integer.parseInt(st.nextToken());
				}

				countStrike = 0;
				countBall = 0;
				// 비교 스트라이크
				for (int j = 0; j < 3; j++) {
					if (randNums[j] == recvNums[j]) {
						countStrike++;
					}
				}

				// 비교 볼
				for (int j = 0; j < 3; j++) {
					for (int l = 0; l < 3; l++) {
						if ((randNums[j] == recvNums[l]) && (j != l)) {
							countBall++;
						}
					}
				}

				sendMsg = countStrike + "스트라이크 " + countBall + "볼";
				dos.writeUTF(sendMsg);

				if (countStrike == 3) {
					dos.writeUTF("exit");
					break;
				}
			}
			
			System.out.println("게임종료");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
