package kom.kh.baseball;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BaseballServer {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
//		InputStream is = null;
//		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Random rand = new Random();
		StringBuffer sb = new StringBuffer();
		Date date =  null;
		SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd hh:mm:ss]");
		
		
		int port = 4885;
		String sendMsg = "";
		String recvMsg = "";
		int[] goals = new int[3];
		String[] nums = new String[3];
		int strike;
		int ball;

		try {
			String time = sdf.format(new Date());  // �ð� ����
			
			System.out.println(time + "���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			
			time = sdf.format(new Date());
			System.out.println(time + "Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			socket = serverSocket.accept();
			System.out.println(time + "Ŭ���̾�Ʈ�� �����߽��ϴ�.");

//			is = socket.getInputStream();
//			os = socket.getOutputStream();
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());

			// �ߺ����� �ʴ� ��ȣ�� �������� 3�� ����

			for (int i = 0; i < goals.length; i++) {
				goals[i] = rand.nextInt(10); // 0~9
				for (int j = 0; j < i; j++) {
					if (goals[i] == goals[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < goals.length; i++)
				sb.append(goals[i]).append(" ");
			System.out.println("���� ���� ->" + sb.toString());
			System.out.println("���� �غ� �Ϸ�");

			while (true) {

				recvMsg = dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ�� �Է��� �� -->" + recvMsg);

				// �Է¹��� ���� int�� ��ȯ�Ͽ� �迭�� �����ϱ�.

				nums = recvMsg.split(" ");
				// strike�� ball üũ
				strike = 0;
				ball = 0;

				if (nums.length != 3) {
					dos.writeUTF("reInput");
					continue;
				}

				for (int i = 0; i < goals.length; i++) {
					for (int j = 0; j < nums.length; j++) {
						int num = Integer.parseInt(nums[j]);

						if (goals[i] == num) {
							if (i == j) {
								strike++;
							} else {
								ball++;
							}
						}
					}
				}

				System.out.println(strike + "S" + ball + "B");

				sendMsg = strike + " ��Ʈ����ũ " + ball + " ��";

				if (strike == 3) {
					time = sdf.format(new Date());
					System.out.println("�ƿ�! ��������!" + time);
					dos.writeUTF("end");
					break;
				} else {
					dos.writeUTF(timePrint(sendMsg));
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String timePrint(String message) {
		SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd hh:mm:ss]");
		String time = sdf.format(new Date());
		
//		System.out.println(time + message);
		return time + message;
	}
	
	
}
