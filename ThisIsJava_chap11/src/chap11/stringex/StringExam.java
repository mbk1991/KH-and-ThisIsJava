package chap11.stringex;

import java.util.regex.Pattern;

public class StringExam {
	public static void main(String[] args) {
		//String의 split 메소드의 매개변수는 단순 구분자가 아니라 정규표현식(regular expression) 이었다!
		
		String str = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] strArr = str.split("&|,|-");
		for(String name: strArr) {
			System.out.print(name+ " ");
		}
		
		
		//StringTokinizer 한종류의 구분자가 있을 경우 문자열을 분리한다.
		//countTokens()  - int 꺼내지 않고 남아있는 토큰의 수  토큰은 문자열을 뜻한다.
		//hasMoreTokens() -boolean 토큰이 남아있는지
		//nextToken - String 토큰을 하나씩 꺼내옴
		//\\백슬래시를 두 개 씩 써줘야 오류가 나지 않음.
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		result = Pattern.matches(regExp,data);
		if(result) {
			System.out.println("정규식과 일치합니다");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		
		
	}
}
