package chap12.thread.exam2;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);   //Thread의 메소드
	}
	
	public void run() {
		for(int i = 0; i < 2000000000; i ++) {
			
		}
		System.out.println(getName());
	}
}
