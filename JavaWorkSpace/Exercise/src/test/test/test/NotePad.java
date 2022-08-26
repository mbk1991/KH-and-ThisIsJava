package test.test.test;
import java.util.*;

public class NotePad {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] inputArr = input.split(" ");
		
		System.out.println(inputArr[1]);
		
		int numA = Integer.parseInt(inputArr[0]);
		int numB = Integer.parseInt(inputArr[1]);

		String answer = "";
		if (numA > numB) {
			answer = ">";
		}
		if (numA < numB) {
			answer = "<";
		}
		if (numA == numB) {
			answer = "==";
		}
		System.out.println(answer);

	}
}
