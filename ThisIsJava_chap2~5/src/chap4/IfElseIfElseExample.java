package chap4;

public class IfElseIfElseExample {
	//if-else if-else 
	public static void main(String[] args) {
		int score = 75;
		
		if(score>= 90) {
			System.out.println("점수가 90~100입니다.");
			System.out.println("A등급입니다.");
		}else if(score >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("B등급입니다.");
		}else if(score >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("C등급입니다.");
		}else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("D등급입니다.");
		}
	}
}
