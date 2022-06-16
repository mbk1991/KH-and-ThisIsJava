package chap4;

public class Exercise04 {
 //두 개의 주사위를 던져 (눈1, 눈2) 의형태로 출력하고 눈1+눈2가 5일때까지 무한반복하는 코드를 작성while
	public static void main(String[] args) {
	
		int sum = 0;
		while (sum!=5) {
			
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			sum = dice1 + dice2 ;
			
			System.out.println("("+dice1+","+dice2+")");
		}
		System.out.println("두 눈의 합이 5입니다. 프로그램 종료");
	}
}
