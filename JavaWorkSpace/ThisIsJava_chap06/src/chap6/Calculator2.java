package chap6;

public class Calculator2 {
//Ŭ���� ���ο��� �޼ҵ� ȣ��
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("������ : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
}
