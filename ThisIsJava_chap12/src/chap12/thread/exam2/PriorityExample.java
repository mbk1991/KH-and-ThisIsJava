package chap12.thread.exam2;

public class PriorityExample {
	
	//�����Ҷ����� �ٸ���. ���̷���.
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i ++) {
			Thread thread = new CalcThread("thread" + i);
			if(i != 20) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
