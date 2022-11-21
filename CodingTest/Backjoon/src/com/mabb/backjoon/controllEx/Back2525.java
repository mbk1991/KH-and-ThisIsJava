package com.mabb.backjoon.controllEx;

import java.util.Scanner;

public class Back2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int HH = 23;
		int mm = 48;
		int needMinute = 25;
		int sumMinute  = mm+needMinute;
		
		int resultHH = 0;
		int resultMm = sumMinute;
		
		if(sumMinute >= 60) {
			resultHH = HH + (sumMinute/60);
			resultHH = (resultHH==24)? 0 : resultHH;
			resultMm = sumMinute%60;
			System.out.println(resultHH+" "+resultMm);
		}else {
			System.out.println(HH+" "+resultMm);
		}
	}
}
