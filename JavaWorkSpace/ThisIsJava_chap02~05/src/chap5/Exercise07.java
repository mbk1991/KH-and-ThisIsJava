package chap5;

public class Exercise07 {
 //for문으로 주어진 배열에서 최대값 구하기
	public static void main(String[] args) {
		// 배열에서 최대값을 구하는 방법을 생각해보자
		// 인덱스0과1을 비교하여 큰 수를 max에 저장, 1과 2를 비교하여 큰 수를 max에 저장 ...length까지 반복
	
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2, 200};
		
		for(int i=0; i<array.length-1; i++) {
			if(array[i] >= array[i+1]) max = array[i];
		    else max = array[i+1];
			}
		System.out.println("max : "+ max);
}
}
