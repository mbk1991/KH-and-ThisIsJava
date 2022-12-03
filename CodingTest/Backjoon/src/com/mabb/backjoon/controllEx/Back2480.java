package com.mabb.backjoon.controllEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] dice = new int[7];
		for(int i=0; i<3; i++) {
			int inputNum = Integer.parseInt(st.nextToken());
			dice[inputNum]++;
		}
		
		int checkNum = 1;
		int maxOne = 0;
		for(int i=1; i<dice.length; i++) {
			if(dice[i] == 3) {
				System.out.println(10000 + 1000 * i);
				break;
			}else if(dice[i] == 2) {
				System.out.println(1000 + 100 * i);
				break;
			}
			if(dice[i] == 1 && checkNum == 3) {
				System.out.println(100 * i);
				break;
			}
			if(dice[i] == 1) {
				checkNum ++;
			}
		}
	}
}
