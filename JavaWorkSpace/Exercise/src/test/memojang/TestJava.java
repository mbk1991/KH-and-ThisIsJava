package test.memojang;

public class TestJava {

	public static void main(String[] args) {
		double x1 = Math.toRadians(40.35);
		double x2 = Math.toRadians(74.65);
		double y1 = Math.toRadians(48.87);
		double y2 = Math.toRadians(-2.33);
		double r = 6371.0;
		
		double left = Math.pow(Math.sin((x2-x1)/2),2);
		double right = Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2),2);
		double distance = 2 * r * Math.asin(Math.sqrt(left+right));
		System.out.println(distance);
	}
}
