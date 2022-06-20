package com.kh.exercise;

import java.util.Scanner;

public class Exercise2_Array {
	public void practice1() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을
		// 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을
		// 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후
		// 그 값을 출력

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		// 사용자에게 입력받은 양의 정수만큼 배열 크기를 할당
		// 1부터 입력받은 값까지 배열에 초기화한 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 입력 > ");
		int arrLength = sc.nextInt();
		while (arrLength < 0) {
			System.out.println("양의 정수 입력>");
			arrLength = sc.nextInt();
		}

		int[] arr = new int[arrLength];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		// 길이가 5인 String배열을 선언하고
		// "사과","귤","포도","복숭아","참외"로 초기화 한 후
		// 배열 인덱스를 활용하여 귤을 출력

		String[] strArray = new String[5];
		strArray = new String[] { "사과", "귤", "포도", "복숭아", "참외" };

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals("귤")) {
				System.out.println("strArray[" + i + "] 이/가 " + strArray[i]);
			}
		}
	}

	public void practice5() {
		// 문자열을 입력받아 문자 하나하나를 배열에 넣고
		// 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와
		// 몇 번째 인덱스에 위치하는지 인덱스를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력> ");
		String inputString = sc.next();
		System.out.print("검색할 문자> ");
		char searchChar = sc.next().charAt(0);

		char[] charArray = new char[inputString.length()];
		int count = 0;

		System.out.print(searchChar + "이/가 존재하는 인덱스 :");
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = inputString.charAt(i);
			if (charArray[i] == searchChar) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + searchChar + "의 개수 : " + count);
	}

	public void practice6() {
		// "월" ~ "일"까지 초기화된 문자열 배열을 만들고 0부터
		// 6까지 숫자를 입력받아 입력한 숫자와 같은 인덱스가 있는
		// 요일을 출력하고 범위에 없을 시 잘못입력 출력

		String[] week = { "월", "화", "수", "목", "금", "토", "일" };
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력> ");
		int inputNum = sc.nextInt();
		while (inputNum < 1 || inputNum > 7) {
			System.out.println("1부터 7사이를 입력하세요.");
			inputNum = sc.nextInt();
		}

//		switch (inputNum) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//		case 7:
//			System.out.println("입력값: " + inputNum + ": " + week[inputNum-1]);
//			break;

		if (inputNum >= 1 && inputNum <= 7) {
			System.out.println("입력값: " + inputNum + ": " + week[inputNum - 1]);
		}
	}

	public void practice7() {
		// 배열의 길이를 직접입력, 그 값만큼 정수형 배열을 선언 및 할당
		// 배열의 크기만큼 사용자가 직접 인덱스 값을 초기화
		// 배열 전체값을 나열하고 각 인덱스의 저장된 값들의 합을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 입력> ");
		int inputLength = sc.nextInt();
		while (inputLength < 0) {
			System.out.println("양수를 입력하세요. >");
			inputLength = sc.nextInt();
		}
		int[] intArray = new int[inputLength];
		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("intArray[%d] 값 입력:", i);
			intArray[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
			System.out.print(intArray[i] + " ");
		}
		System.out.println("\n총 합 : " + sum);

	}

	public void practice8() {
		// 3이상인 홀수 자연수를 입력받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력
		// 입력 정수가 홀수가 아니거나 3미만일 경우 다시 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("3이상 홀수 입력하세요");
		int input = sc.nextInt();
		while ((input < 3) || (input % 2 != 1)) {
			System.out.println("3이상 홀수를 입력하세요>");
			input = sc.nextInt();
		}

		int[] arr = new int[input];
		for (int i = 0; i < arr.length; i++) {
			if (i <= ((input - 1) / 2)) {
				arr[i] = i + 1;
			} else {
				arr[i] = input - i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public void practice9() {
//		//사용자가 입력한 값이 배열에 있는지 검색하여
//	    있으면 "OOO치킨 배달 가능" 없으면 "OOO치킨은 없는 메뉴입니다"를 출력
//	    단, 치킨 메뉴가 들어가 있는 배열은 본인스스로 정함
		Scanner sc = new Scanner(System.in);

		String[] chickenMenu = { "양념", "후라이드", "간장", "파닭", "레드오리지널" };

		System.out.print("치킨 이름을 입력하세요: ");
		String inputString = sc.next();

		int count =0;
		for (int i = 0; i < chickenMenu.length; i++) {
			if (chickenMenu[i].equals(inputString)) {
				System.out.println(inputString + "치킨은 배달 가능");
				count ++;
				break;
			}
		}
		if(count==0) {
			System.out.println("없는메뉴입니다.");
		}
	}
	public void practice10() {
		//주민번호 마스킹 문제 수업 중 풂
	}
}
