package chap4;

public class IfNestedExample {
	// 중첩 if문
	public static void main(String[] args) {
		int score = (int) (Math.random() * 20) + 81;

		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+입니다.");
			}else {System.out.println("A입니다.");
		}
		}else if(score >= 80){
			if(score >=85) {
				System.out.println("B+입니다.");
			}else {
				System.out.println("B입니다.");
			}

	}
}
}
