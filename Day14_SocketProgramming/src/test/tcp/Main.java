package test.tcp;


public class Main {
	static final int port = 9007;
	
	public static void main(String[] args) {
		new TCPEchoServer().tcpServer(port);
		
	
	}
}
