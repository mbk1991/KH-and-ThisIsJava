package chap3;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++; // x는 10
		--x; // x는 11 -1 = 10
		System.out.println("x= " + x);
		
		System.out.println("--------------------");
		y--; //y는 10
		--y; // y는 9-1 = 8
		System.out.println("y= " + y);
		
		System.out.println("--------------------");
		z= x++; // z = 10 , x = 11
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("--------------------");
		z= ++x; // z = 12 x = 12
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("--------------------");
		z= ++x + y++; // z = 13+8 = 21 , x= 13 y =9
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}
