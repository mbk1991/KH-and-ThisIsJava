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
			String time = sdf.format(new Date());  // 시간 추출
			
			System.out.println(time + "서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			
			time = sdf.format(new Date());
			System.out.println(time + "클라이언트의 접속을 기다립니다.");
			socket = serverSocket.accept();
			System.out.println(time + "클라이언트가 접속했습니다.");

//			is = socket.getInputStream();
//			os = socket.getOutputStream();
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());

			// 중복되지 않는 번호를 랜덤으로 3개 추출

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
			System.out.println("서버 숫자 ->" + sb.toString());
			System.out.println("서버 준비 완료");

			while (true) {

				recvMsg = dis.readUTF();
				System.out.println("클라이언트가 입력한 수 -->" + recvMsg);

				// 입력받은 값을 int로 변환하여 배열에 저장하기.

				nums = recvMsg.split(" ");
				// strike와 ball 체크
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

				sendMsg = strike + " 스트라이크 " + ball + " 볼";

				if (strike == 3) {
					time = sdf.format(new Date());
					System.out.println("아웃! 게임종료!" + time);
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
