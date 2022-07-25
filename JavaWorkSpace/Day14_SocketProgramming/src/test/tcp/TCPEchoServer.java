package test.tcp;

import java.io.*;
import java.net.*;

public class TCPEchoServer {
	public void tcpServer(int port) {
		// 서버 소켓 관련 객체
		ServerSocket serverSock = null;
		Socket sock = null;
		InetAddress inetAddr = null;

		// 입출력 객체
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;

		// 서버소켓생성
		try {
			serverSock = new ServerSocket(port);

			while (true) {
				// 클라이언트의 접속 대기
				System.out.println("=====클라이언트 접속 대기 중" + "(port:" + serverSock.getLocalPort() + ")=====");
				sock = serverSock.accept();

				// 클라이언트의 접속 요청
				inetAddr = serverSock.getInetAddress();
				System.out.println("클라이언트(" + inetAddr.getHostAddress() + ") 접속");

				// 클라이언트와 통신을 위한 stream 생성
				in = sock.getInputStream();
				out = sock.getOutputStream();
				br = new BufferedReader(new InputStreamReader(in));
				wr = new PrintWriter(new OutputStreamWriter(out));
				String msg = null;

				// 클라이언트와 통신
				while ((msg = br.readLine()) != null) {
					System.out.println("\tCLIENT>" + msg);
					wr.println(msg);
					wr.flush();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				br.close();
				wr.close();
				in.close();
				out.close();
				sock.close();
				serverSock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("종료");
		}
	}
}
