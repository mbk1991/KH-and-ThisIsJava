package test.tcp;

import java.util.*;
import java.net.*;
import java.sql.ClientInfoStatus;
import java.io.*;

public class TcpServerMulti {
	private HashMap<String,User> users;
	private Vector<Socket> clients;
	
	public TcpServerMulti() {
		users = new HashMap<String,User>();
		
		User[] userList = new User[] {
				new User("user01","pass01","smileman"),
				new User("user02","pass02","prittywoman"),
				new User("user03","pass03","javajjang"),
				new User("user04","pass04","testboy"),
				new User("p1234","p1234","pick")};
		
		for(User u : userList) {
			users.put(u.getUserId(),u);
		}
		
	}
	
	public Map<String,User> getUsers(){
		return users;
	}
	
	public Vector<Socket> getClients(){
		return clients;
	}
	
	public String loginCheck(String id, String pwd) {
		String nickName = null;
		
		if(users.containsKey(id)) {
			User loginUser = users.get(id);
			
			if(loginUser.getUserPwd().equals(pwd))
				nickName = loginUser.getNickName();
		}
		return nickName;
	}
	
	public void displayMsg(String clientMessage) {
		System.out.println(clientMessage);
	}
	
	
	public static void main(String[] args) {
		TcpServerMulti tServer = new TcpServerMulti();
		
		int port = 7979;
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			while(true) {
				Socket client = server.accept();
				tServer.clients.addElement(client);
				
				new ClientHandler(tServer,client).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
