package chap12.thread.exam;

public class BeepPrintExample2 {
	
	//�����ϸ� "��"�� ����̵ʰ� ���ÿ� �������� ���Ÿ�
	public static void main(String[] args) {  //���ν�����
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); //  �۾������� ����!
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
