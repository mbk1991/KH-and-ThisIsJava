package chap5;

public class Exercise07 {
 //for������ �־��� �迭���� �ִ밪 ���ϱ�
	public static void main(String[] args) {
		// �迭���� �ִ밪�� ���ϴ� ����� �����غ���
		// �ε���0��1�� ���Ͽ� ū ���� max�� ����, 1�� 2�� ���Ͽ� ū ���� max�� ���� ...length���� �ݺ�
	
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2, 200};
		
		for(int i=0; i<array.length-1; i++) {
			if(array[i] >= array[i+1]) max = array[i];
		    else max = array[i+1];
			}
		System.out.println("max : "+ max);
}
}
