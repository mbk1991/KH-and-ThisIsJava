package chap5;

public class StringEqualsExample {
	// 문자열 비교
	public static void main(String[] args) {
		String strVar1 = "고양이";
		String strVar2 = "고양이";

		if (strVar1 == strVar2)
			System.out.println("strVar1과 strVar2는 참조가 같음");
		else
			System.out.println("참조가 다름");

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		String strVar3 = new String("고양이");
		String strVar4 = new String("고양이");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
			}
		}
	}

