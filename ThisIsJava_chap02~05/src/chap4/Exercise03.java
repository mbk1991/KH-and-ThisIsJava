package chap4;

public class Exercise03 {
	//for���� �̿��Ͽ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ�
	public static void main(String [] args) {
		
		int sum = 0;
		for(int i = 1 ; i <=100 ; i ++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("sum : " + sum);
		
	}
}
