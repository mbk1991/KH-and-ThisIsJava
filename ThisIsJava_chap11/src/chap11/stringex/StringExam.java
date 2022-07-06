package chap11.stringex;

import java.util.regex.Pattern;

public class StringExam {
	public static void main(String[] args) {
		//String�� split �޼ҵ��� �Ű������� �ܼ� �����ڰ� �ƴ϶� ����ǥ����(regular expression) �̾���!
		
		String str = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		
		String[] strArr = str.split("&|,|-");
		for(String name: strArr) {
			System.out.print(name+ " ");
		}
		
		
		//StringTokinizer �������� �����ڰ� ���� ��� ���ڿ��� �и��Ѵ�.
		//countTokens()  - int ������ �ʰ� �����ִ� ��ū�� ��  ��ū�� ���ڿ��� ���Ѵ�.
		//hasMoreTokens() -boolean ��ū�� �����ִ���
		//nextToken - String ��ū�� �ϳ��� ������
		//\\�齽���ø� �� �� �� ����� ������ ���� ����.
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		result = Pattern.matches(regExp,data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		
		
	}
}
