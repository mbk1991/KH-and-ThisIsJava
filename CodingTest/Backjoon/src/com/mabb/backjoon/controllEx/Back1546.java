package com.mabb.backjoon.controllEx;

import java.util.Arrays;
import java.util.Scanner;

public class Back1546 {
	
	
	public static void main(String[] args) {
		/*
		 * 최대값을 구하고
		 * 모든 값을 최대값으로 나누고 *100
		 */
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String scores = sc.nextLine();
		//문자열을 나누고 숫자로 바꿔 배열에 담고 정렬하여 최대값을.
		//또는 반복문으로 그냥 최대값 구함.
		
		String[] scoresArr = scores.split(" ");
		int[] scoresArrInt = new int[N];
		
		//숫자로 바꾸어 배열에 담음
		for(int i=0; i<scoresArr.length; i++) {
			scoresArrInt[i] = Integer.parseInt(scoresArr[i]);
		}
		
		//최대값을 구함
		int maxScore = 0;
		for(int i=0; i<scoresArrInt.length; i++) {
			if(maxScore < scoresArrInt[i]) {
				maxScore = scoresArrInt[i];
			}
		}
		
		//조작된 새로운 점수 배열을 만들고 합계도 구하자
		//디버깅 짱 좋다.
		double[] modifyScoreArr = new double[N];
		double modifySum = 0;
		for(int i=0; i<scoresArrInt.length;i++) {
			//여기가 잘못됨. 몫으로 하니 0이 나오지. 이건 double로 가자
			modifyScoreArr[i] = ((double)scoresArrInt[i]/maxScore) * 100;
			modifySum += modifyScoreArr[i];
		}
		System.out.println((double)modifySum/N);
	}
}
