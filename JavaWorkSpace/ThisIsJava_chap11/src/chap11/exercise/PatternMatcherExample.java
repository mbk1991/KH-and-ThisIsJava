package chap11.exercise;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "Angel1004";
		String regExp = "[a-z,A-Z]{1}\\w{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
			
		}else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}
	}
}