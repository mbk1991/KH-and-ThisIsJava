package com.kh.javaapi;

public class Exam_WrapperClass {
	// Wrapper Ŭ����

	public static void main(String[] args) {
		int num = 3;
		Integer input = new Integer(3);

//		parseExample();
//		boxingExample();
//		parsingStringExample();
		
		//int���� Integer�� ���������� �����ϴ� 3���� ���.
		Integer num1 = 10; //int ���ͷ��� �ٷ� ���� ����. ����ڽ�
		Integer num2 = new Integer(10);  //new�����ڷ� ��ü�� �ּ� ���� ����
		Integer num3 = Integer.valueOf(10); //valueOf()�޼ҵ� �⺻���� �Ű������� �޾� wrapper���� ��ȯ.
		
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
		
	
		
		
		//���������ε� intó�� ������ �����ϴ�.
		System.out.println(num1+ num2+ num3);
		int result = num1 * num2 * num3;
		System.out.println(result);
		
		//null�� ������ ���� �ִ�.
		num1 = null;
		System.out.println(num1);
		
		//��ü���� �⺻���� ���굵 �����ϴ�. 
		int num4 = Integer.parseInt("100");
		Integer num5 = Integer.parseInt("200");
		long num6 = Integer.parseInt("300");
		System.out.println(num4 + num5 + num6);

	}
	static void parsingStringExample() { //�⺻���� String���� ������ֱ�
		//WrapperŬ������ ��üȭ �� ���� toString�Ͽ� String���� ��ȯ�޴°�.
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
		
		//String.valueOf(123) �� Integer.valueOf(123).toString() �� ����.
		
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
