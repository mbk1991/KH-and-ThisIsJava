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
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");

			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			// ���� ���� ����, �ߺ����� randNums�迭�� ����
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

			// ������ ���ڸ� ǥ��
			System.out.print("���� ���� --->");
			for (int k = 0; k < 3; k++) {
				System.out.print(randNums[k] + " ");
			}

			while (true) {
				// �Է¹��� ���ڿ� �迭�� ����.
				recvMsg = dis.readUTF();
				System.out.println("���� ���ڿ� :" + recvMsg);
				st = new StringTokenizer(recvMsg, " ");
				if (st.countTokens() != 3) {
					dos.writeUTF("�߸��Է��Ͽ����ϴ�.");
					continue;
				}

				// ���� ���ڿ��� int�迭�� ���
				for (int j = 0; j < recvNums.length; j++) {
					recvNums[j] = Integer.parseInt(st.nextToken());
				}

				countStrike = 0;
				countBall = 0;
				// �� ��Ʈ����ũ
				for (int j = 0; j < 3; j++) {
					if (randNums[j] == recvNums[j]) {
						countStrike++;
					}
				}

				// �� ��
				for (int j = 0; j < 3; j++) {
					for (int l = 0; l < 3; l++) {
						if ((randNums[j] == recvNums[l]) && (j != l)) {
							countBall++;
						}
					}
				}

				sendMsg = countStrike + "��Ʈ����ũ " + countBall + "��";
				dos.writeUTF(sendMsg);

				if (countStrike == 3) {
					dos.writeUTF("exit");
					break;
				}
			}
			
			System.out.println("��������");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
