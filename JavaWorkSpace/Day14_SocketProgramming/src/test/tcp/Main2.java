package test.tcp;

public class Main2 {
	public static final int port = 9007;
	
	public static void main(String[] args) {
		new TCPEchoClient().clientTCP("localhost",port);
	}
}
