package chap5;

public class ArrayCreateByValueListExample {
	//값의 리스트로 배열 생성
	public static void main(String [] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		//scores = {10, 20, 30}; 컴파일 에러, 값의 리스트로 배열 생성시 new 연산자로 초기화 필요
		int sum1 = 0;
		for(int i =0; i <= scores.length -1 ; i ++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		int sum2 = 0;
		sum2 = add(scores);
		System.out.println("총합2 : " + sum2);
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i =0; i<=scores.length-1; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
