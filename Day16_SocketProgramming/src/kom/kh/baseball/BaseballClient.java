package kom.kh.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {
	public static void main(String[] args) {

		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);

		int port = 4885;
		String host = "127.0.0.1";
		String sendMsg = "";
		String recvMsg = "";

		try {
			socket = new Socket(host, port);
			System.out.println("Ŭ���̾�Ʈ ������ �����Ͽ����ϴ�.");

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
			for (;;) {

				System.out.print("--> ");
				sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);

				recvMsg = dis.readUTF();
				if (recvMsg.equals("reInput")) {
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}

				System.out.println(recvMsg);

				if (recvMsg.equals("end")) {
					System.out.println("������ϴ�!");
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
