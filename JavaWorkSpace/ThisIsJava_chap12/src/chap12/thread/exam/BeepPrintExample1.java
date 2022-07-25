package chap12.thread.exam;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String [] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // ��Ŷ ��ü ���, �����ڷ� �� ��°� ���� �̱����ΰ�?
		//beep���� ������ִ� ��Ŷ. ���� �� �ʴ� �ѹ��� �������� �︰ �� ����Ʈ�� �ȴ�.
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
