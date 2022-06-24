package com.kh.javaapi;

public class Exam_WrapperClass {
	// Wrapper 클래스

	public static void main(String[] args) {
		int num = 3;
		Integer input = new Integer(3);

//		parseExample();
//		boxingExample();
		parsingStringExample();

	}
	static void parsingStringExample() { //기본형을 String으로 만들어주기
		//Wrapper클래스로 객체화 한 것을 toString하여 String으로 반환받는것.
		//3 - String
		String iStr = Integer.valueOf(3).toString();
		System.out.println(iStr);
		
		String bStr = Byte.valueOf((byte)5).toString();
		String sStr = Short.valueOf((short)4).toString();
		String lStr = Long.valueOf((long)5).toString();
		
		String fStr = Float.valueOf(0.3f).toString();
		String dStr = Double.valueOf(0.21).toString();
		
		String boolStr = Boolean.valueOf(true).toString();
		String cStr = Character.valueOf('A').toString();
		
		//String.valueOf(123) 이 Integer.valueOf(123).toString() 와 같다.
		
	}

	static void boxingExample() {

		Integer nInput = 100; // 오토박싱
		// 100 -> new Integer(100);

		Integer input = 3;
		int iNum = input.intValue();
		System.out.println(iNum);

	}

	static void wrapperExample() {

		Long lNum = new Long(22222);

		// Wrapper객체로 만들어주는 메소드
		Integer value = Integer.valueOf(33);
		Long lValue = Long.valueOf("2222");
	}

	static void parseExample() {

		String strNum = "220613";
		String strNum2 = "221118";
		// int result = strNum2 - strNum;
		int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
		System.out.println("결과 : " + result);

		String strNum3 = "3.14";
		double result2 = Double.parseDouble(strNum3);
		System.out.println("결과 : " + result2);

	}

	static void dataParsing() {

		//////////////////////////////
		byte bValue = Byte.parseByte("1"); // String을 byte로 바꿈
		short sValue = Short.parseShort("2");
		int iValue = Integer.parseInt("3");
		long lInput = Long.parseLong("4");
		float fValue = Float.parseFloat("0.1");
		double dValue = Double.parseDouble("0.2");
		boolean bInput = Boolean.parseBoolean("true");

//		char cValue = Character.parseChar("A"); (X)
		// Charcter 는 있으나 parse는 없음
		char cValue = "JAVA".charAt(0); // 중요!

	}
}
