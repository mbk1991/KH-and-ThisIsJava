package chap4;

public class IfExample {
	//if��
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A����Դϴ�.");
		}
		if(score < 90) 
			System.out.println("������ 90���� �۽��ϴ�");
			System.out.println("����� B����Դϴ�."); // if���� ������� ���๮
			// if�� �߰�ȣ�� ġ�� ���� ���  ���� ���๮�� �����Ѵ�.for�� while��?
			
		int i = 0;	
		for(i = 0 ; i < 6 ; i ++) System.out.println(i); System.out.println("�̰���?");

			
		
		
	}
}
