package test.test.test;

import java.util.ArrayList;
import java.util.HashMap;

public class DartTest {
	public static void main(String[] args) {

		String a1 = "1S2D*3T";
		// 1^1*2 + 2^2*2 + 3^3
		// 크기가3인 배열을 3개 만든다
		// number[] 에 숫자 세 개 를 담는다
		// bonus[] 에 알파벳 세 개를 담는다
		// option[] 인덱스에 맞춰 옵션을 담는다
		// bonus와 option에 따라 number를 조정한다.

		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Character> bonus = new ArrayList<>();
		char[] options = new char[3];
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int sum = 0;

		String[] temp = a1.split("S|D|T|\\*|#");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals("")) {
				continue;
			}
			int num = Integer.parseInt(temp[i]);
			numbers.add(num);
		}

		int checkIndex = 0;
		for (int i = 0; i < a1.length(); i++) {
			char tempChar = 0;
			if (a1.charAt(i) == 'S') {
				tempChar = 'S';
			} else if (a1.charAt(i) == 'D') {
				tempChar = 'D';
			} else if (a1.charAt(i) == 'T') {
				tempChar = 'T';
			}
			if (tempChar == 0)
				continue;
			bonus.add(tempChar);

			if ((i + 1) < a1.length()) {
				if (a1.charAt(i + 1) == '*') {
					options[checkIndex] = '*';
				} else if (a1.charAt(i + 1) == '#') {
					options[checkIndex] = '#';
				}
			}
			checkIndex++;
		}
		
		for(char c : bonus) {
			System.out.println(c);
		}
		
		for(int i=0; i<3; i++) {
			
			switch(bonus.get(i)) {
			case 'D':
				numbers.set(i, numbers.get(i) * numbers.get(i));
				break;
			case 'T':
				numbers.set(i, numbers.get(i) * numbers.get(i) * numbers.get(i));
				break;
			}
		}
		
		for(int i=0; i<3; i++) {
			if(options[i] == '*') {
				numbers.set(i, numbers.get(i) * 2);
				if(i>0) {
					numbers.set(i-1, numbers.get(i-1)*2);
				}
			}else if(options[i] =='#') {
				numbers.set(i, -numbers.get(i));
			}
		}
		
		for(int n : numbers) {
			sum += n;
		}
		
	}
}
