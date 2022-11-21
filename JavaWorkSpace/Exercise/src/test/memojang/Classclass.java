package test.memojang;

import java.lang.reflect.Method;
import java.sql.Date;
import java.util.List;

public class Classclass {

	public static void main(String[] args) {
		System.out.println(String.class);
		System.out.println(Integer.class);
		System.out.println(StringBuilder.class);
		System.out.println(Date.class);
		for(Method m : List.class.getMethods()) {
				System.out.println(m);
		}
		
		Classclass c = new Classclass();
		c.printResult(calNum(1,2));
		
	}
	public void printResult(int num) {
		System.out.println(num);
	}
	
	public static int calNum(int a , int b) {
		return a+b;
	}
}
