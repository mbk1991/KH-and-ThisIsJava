package chap6;

public class KoreanExample {
	//°´Ã¼ »ý¼º ÈÄ ÇÊµå°ª Ãâ·Â
	public static void main(String[] args) {
		Korean k1 = new Korean("¿ö·»¹öÇÍ", "300830-5xxxxxx");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("ÀÓ²©Á¤","020505-3111111");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
	}
}
