package chap5;

public class ArrayCopyByForExample {
	// for문으로 배열 복사
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+", ");
		}
	}
}
