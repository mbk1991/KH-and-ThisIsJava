package chap4;

public class Exercise05 {
	//중첩for문 4x+5y = 60 의 모든 해를 구해서 (x,y) 형태로 출력, x,y는 10이하의 자연수
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
