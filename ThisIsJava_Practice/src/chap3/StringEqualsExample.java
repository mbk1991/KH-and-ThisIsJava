package chap3;

public class StringEqualsExample {
	//πÆ¿⁄ø≠ ∫Ò±≥
	public static void main(String[]args) {
		String strVar1 = "Ω≈πŒ√∂";
		String strVar2 = "Ω≈πŒ√∂";
		String strVar3 = new String("Ω≈πŒ√∂");
		
		System.out.println(strVar1 == strVar2);  //true
		System.out.println(strVar1 == strVar3); //false
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //true
		System.out.println(strVar1.equals(strVar3)); //true
	}

}
