package chap2;
import java.util.Scanner;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("byte�� ��ȯ�� int�� �Է�: ");
			int i = sc.nextInt();
			if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {  //Byte ���� ũ�Ⱑ ����� ����Ǿ��ִ�.!
				System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
				System.out.println("���� �ٽ� Ȯ�����ּ���");
			} else {
				byte b = (byte) i ;
				System.out.println("byte����ȯ�� ����" +b);
		   }
		}
	}
}
