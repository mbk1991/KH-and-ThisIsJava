package com.kh.exceptionex;

public class Exam_Exception3 {
	public static void main(String[] args) {
		// NumberFormatException ����ȯ (���� ->����)
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
				System.out.println("���ڷ� ��ȯ�� ���� : " + pNum);
			}

		} catch (NumberFormatException e) {
			System.out.println(strNumber[i] + "�� ������ ��ȯ�� �� �����ϴ�.");

		}
	}
}
