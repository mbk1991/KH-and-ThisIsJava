package chap4;

public class IfNestedExample {
	// ��ø if��
	public static void main(String[] args) {
		int score = (int) (Math.random() * 20) + 81;

		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+�Դϴ�.");
			}else {System.out.println("A�Դϴ�.");
		}
		}else if(score >= 80){
			if(score >=85) {
				System.out.println("B+�Դϴ�.");
			}else {
				System.out.println("B�Դϴ�.");
			}

	}
}
}
