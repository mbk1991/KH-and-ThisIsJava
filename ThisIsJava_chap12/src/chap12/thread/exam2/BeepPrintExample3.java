package chap12.thread.exam2;

public class BeepPrintExample3 {
	public static void main(String[] args) {
			
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
