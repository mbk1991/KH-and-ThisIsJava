package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner3 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("이름을 입력해주세요 : ");
	String name = sc.next();
	System.out.print("태어난 월을 입력해주세요 (숫자만): ");
	int month = sc.nextInt();
	System.out.print("키를 입력해주세요 (실수): ");
	double height = sc.nextDouble();
	System.out.print("성별을 입력해주세요 : ");
	char gender = sc.next().charAt(0);
	System.out.print("주소을 입력해주세요 : ");
	sc.nextLine();  //이 부분이 포인트
	String adress = sc.nextLine();
	
	System.out.println("이름은 " + name +"입니다.");
	System.out.println("태어난 월은 " + month + "월 입니다.");
	System.out.println("키는 " + height + "입니다.");
	System.out.println("성별은 " + gender + "입니다.");
	System.out.println("주소는 " + adress + "입니다.");
	
	
 }
}
