package chap2;
import java.util.Scanner;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("byte로 변환할 int값 입력: ");
			int i = sc.nextInt();
			if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {  //Byte 값의 크기가 상수로 저장되어있다.!
				System.out.println("byte 타입으로 변환할 수 없습니다.");
				System.out.println("값을 다시 확인해주세요");
			} else {
				byte b = (byte) i ;
				System.out.println("byte형변환한 값은" +b);
		   }
		}
	}
}
