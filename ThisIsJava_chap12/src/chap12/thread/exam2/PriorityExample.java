package chap12.thread.exam2;

public class PriorityExample {
	
	//실행할때마다 다르다. 왜이럴까.
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
