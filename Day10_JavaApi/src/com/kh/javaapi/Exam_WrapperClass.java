package com.kh.javaapi;

public class Exam_WrapperClass {
	// Wrapper 클래스

	public static void main(String[] args) {
		int num = 3;
		Integer input = new Integer(3);

//		parseExample();
//		boxingExample();
//		parsingStringExample();
		
		//int값을 Integer형 참조변수에 대입하는 3가지 방법.
		Integer num1 = 10; //int 리터럴을 바로 대입 가능. 오토박싱
		Integer num2 = new Integer(10);  //new연산자로 객체의 주소 대입 가능
		Integer num3 = Integer.valueOf(10); //valueOf()메소드 기본형을 매개변수로 받아 wrapper형을 반환.
		
		num1 = null;
		
		int intNum = num1;
		
//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}catch(NullPointerException e){
//			
//		}finally {
//		}
//			
//		}
		
	
		
		
		//참조변수인데 int처럼 연산이 가능하다.
		System.out.println(num1+ num2+ num3);
		int result = num1 * num2 * num3;
		System.out.println(result);
		
		//null을 대입할 수가 있다.
		num1 = null;
		System.out.println(num1);
		
		//객체형과 기본형의 연산도 가능하다. 
		int num4 = Integer.parseInt("100");
		Integer num5 = Integer.parseInt("200");
		long num6 = Integer.parseInt("300");
		System.out.println(num4 + num5 + num6);

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
