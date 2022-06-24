package com.kh.javaapi;

public class Exam_WrapperClass {
	// Wrapper Ŭ����

	public static void main(String[] args) {
		int num = 3;
		Integer input = new Integer(3);

//		parseExample();
		boxingExample();

	}

	static void boxingExample() {

		Integer nInput = 100; // ����ڽ�
		// 100 -> new Integer(100);

		Integer input = 3;
		int iNum = input.intValue();
		System.out.println(iNum);

	}

	static void wrapperExample() {

		Long lNum = new Long(22222);

		// Wrapper��ü�� ������ִ� �޼ҵ�
		Integer value = Integer.valueOf(33);
		Long lValue = Long.valueOf("2222");
	}

	static void parseExample() {

		String strNum = "220613";
		String strNum2 = "221118";
		// int result = strNum2 - strNum;
		int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
		System.out.println("��� : " + result);

		String strNum3 = "3.14";
		double result2 = Double.parseDouble(strNum3);
		System.out.println("��� : " + result2);

	}

	static void dataParsing() {

		//////////////////////////////
		byte bValue = Byte.parseByte("1"); // String�� byte�� �ٲ�
		short sValue = Short.parseShort("2");
		int iValue = Integer.parseInt("3");
		long lInput = Long.parseLong("4");
		float fValue = Float.parseFloat("0.1");
		double dValue = Double.parseDouble("0.2");
		boolean bInput = Boolean.parseBoolean("true");

//		char cValue = Character.parseChar("A"); (X)
		// Charcter �� ������ parse�� ����
		char cValue = "JAVA".charAt(0); // �߿�!

	}
}
