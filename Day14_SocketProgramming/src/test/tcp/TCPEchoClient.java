package test.tcp;

import java.io.*;
import java.net.*;

public class TCPEchoClient {

//	public static final int port = 9007;
//	public String ip = "127.0.0.1";

	public void clientTCP(String ip, int port) {
		Socket sock = null;

		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		BufferedReader stdin = null;

		try {
			sock = new Socket(ip, port);
			System.out.println("���Ӽ���!!");

			// ������ ����� ���� stream, ǥ���Էº���
			in = sock.getInputStream();
			out = sock.getOutputStream();
			br = new BufferedReader(new InputStreamReader(in));
			wr = new PrintWriter(new OutputStreamWriter(out));
			stdin = new BufferedReader(new InputStreamReader(System.in));
			String msg = null;
			String echo = null;

			// ������ ���
			do {
				System.out.println("\t Insert Msg > ");
				msg = stdin.readLine();

				// "exit"�Է����� ���� ����
				if (msg.equals("exit")) {
					sock.close();
					break;
				}

				// ���ڸ޽��� ���
				wr.println(msg);
				wr.flush();
				echo = br.readLine();
				System.out.println("\tSERVER > " + echo);
			} while (msg != null);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				stdin.close();
				br.close();
				wr.close();
				in.close();
				out.close();
				sock.close();
				System.out.println("����");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
