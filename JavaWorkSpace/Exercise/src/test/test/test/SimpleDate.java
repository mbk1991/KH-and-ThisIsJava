package test.test.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
	public static void main(String[] args) {
		
		String fromForm = "yyMMdd";
		String toForm = "yyyy³â MM¿ù ddÀÏ";
		
		SimpleDateFormat from = new SimpleDateFormat(fromForm);
		SimpleDateFormat to = new SimpleDateFormat(toForm);
		
		String birthDay = "910306";
		
		try {
			Date date = from.parse(birthDay);
			System.out.println(date.toString());
			
			
			int a = 1;
			String aStr = String.valueOf(a);
			
			
			String result = to.format(date);
			
			System.out.println(result);
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
