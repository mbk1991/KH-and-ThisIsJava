package chap4;

public class IfExample {
	//if문
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A등급입니다.");
		}
		if(score < 90) 
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B등급입니다."); // if문과 상관없는 실행문
			// if문 중괄호를 치지 않을 경우  다음 실행문만 실행한다.for나 while은?
			
		int i = 0;	
		for(i = 0 ; i < 6 ; i ++) System.out.println(i); System.out.println("이것은?");

			
		
		
	}
}
