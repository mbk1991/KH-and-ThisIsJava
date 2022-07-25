package com.kh.exceptionex;

public class Exam_Exception3 {
	public static void main(String[] args) {
		// NumberFormatException 형변환 (문자 ->숫자)
		String numStr = "3";
		int num = 0;
		num = Integer.parseInt(numStr);
		String dNumStr = "3.14";
		// double dNum = 0;
		// dNum = Double.parseDouble(dNumStr);
//		int parseNum = Integer.parseInt(dNumStr);

		String[] strNumber = { "23.323", "12.123", "3.14", "98" };
		int i = 0;
		try {
			for (i = 0; i < strNumber.length; i++) {
				if (strNumber[i].contains(".")) {
					strNumber[i] = strNumber[i].substring(0, strNumber[i].indexOf("."));
				}

				int pNum = Integer.parseInt(strNumber[i]);
				System.out.println("숫자로 변환된 값은 : " + pNum);
			}

		} catch (NumberFormatException e) {
			System.out.println(strNumber[i] + "는 정수로 변환할 수 없습니다.");

		}
	}
}
