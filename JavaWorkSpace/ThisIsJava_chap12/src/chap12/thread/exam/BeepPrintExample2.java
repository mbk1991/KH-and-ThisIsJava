package chap12.thread.exam;

public class BeepPrintExample2 {
	
	//실행하면 "띵"이 출력이됨과 동시에 비프음이 띵띵거림
	public static void main(String[] args) {  //메인스레드
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); //  작업스레드 시작!
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
