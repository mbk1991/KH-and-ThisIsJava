package chap12.thread.exam;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String [] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷 객체 얻기, 생성자로 안 얻는거 보니 싱글톤인가?
		//beep음을 만들어주는 툴킷. 실행 시 초당 한번씩 비프음이 울린 후 프린트가 된다.
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
