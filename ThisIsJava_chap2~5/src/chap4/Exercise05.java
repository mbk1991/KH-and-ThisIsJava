package chap4;

public class Exercise05 {
	//��øfor�� 4x+5y = 60 �� ��� �ظ� ���ؼ� (x,y) ���·� ���, x,y�� 10������ �ڿ���
	public static void main(String[] args) {
		
		for(int x = 0 ; x <= 10 ; x ++) {
			for(int y = 0 ; y <= 10 ; y++) {
				if((4*x) + (5*y) == 60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}
}
