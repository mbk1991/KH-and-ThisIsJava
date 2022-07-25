package chap6;

public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField\t" + fiv.byteField);
		System.out.println("shortField\t" + fiv.shortField);
		System.out.println("intField\t" + fiv.intField);
		System.out.println("longField\t" + fiv.longField);
		System.out.println("floatField\t" + fiv.floatField);
		System.out.println("doubleField\t" + fiv.doubleField);
		System.out.println("charField\t" + fiv.charField);
		System.out.println("booleanField\t" + fiv.booleanField);
		
		System.out.println("arrField\t" + fiv.arrField);
		System.out.println("referenceField\t" + fiv.referenceField);
		
		
	}
}
