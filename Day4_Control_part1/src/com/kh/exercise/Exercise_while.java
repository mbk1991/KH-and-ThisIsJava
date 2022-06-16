package com.kh.exercise;

import java.util.Scanner;

public class Exercise_while {
	
	public void exercise1() {
		//while 문을 이용하여 1~100 사이의 홀수의 합 출력
		
		int sum = 0;
		int i = 1;
		while(i<=100) {
			sum += i;
			i+=2;	
		}
		System.out.println("1부터 100 사이 홀수의 합 출럭 : " + sum);
		
		
	}
	public void exercise2() {
		//while문을 이용하여 구구단
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		while(true) {
			System.out.println("while문을 이용한 구구단!");
			System.out.print("1~9사이 정수 입력: ");
			int input = sc.nextInt();
			if(input>=1 && input<= 9) {
				int j = 1;
				while(j<=9) {
					System.out.println(input+ "*" + j+ "="+ input*j);
					j++;
				}
			}else {System.out.println("1~9사이의 양수를 입력하여야합니다.");}
		}
		
		
	}
	public void exercise3() {
		// -1이 입력될 때까지 정수를 입력받고 -1입력받으면 이전까지 입력한 값의 합을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("-1을 입력받기 전까지 입력받은 수의 합");
		
		int sum = 0;
		boolean check = true;
		while(check) {
			System.out.print("정수 하나 입력: ");
			int input2 = sc.nextInt();		
			if(input2 == -1) {
				System.out.println("입력하신 수의 합은 : " + sum);
				check = false;
			}else {
				sum += input2;
			}
		}

		
		
	}
	public void exercise4() {
		//while문을 이용하여 -1이 될 때까지 정수 여려개를 입력받고 평균을 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("-1을 입력받기 전까지 입력받은 수의 갯수와 값의 평균");
		
		int sum = 0;
		int count = 0;
		double average = 0;
		boolean check2 = true;
		
		while(check2) {
			System.out.print("정수 하나 입력 : ");
			int input3 = sc.nextInt();	
			
			if(input3 == -1) {
				if(count == 0) {
					System.out.println("입력된 수가 없습니다.");
					check2 =false;
				}else {
					average = (double)sum / (double)count;
					System.out.println("정수의 갯수는" + count +"개이며 평균은" + average + "입니다.");
					check2 =false;
				}
			}else {
				sum += input3;
				count++;		
					}
			}
 }
}

