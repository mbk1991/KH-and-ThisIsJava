package test.memojang;

public class CMYKtoRGB {

	public static void main(String[] args) {
		double cyan = 0.0;
		double magenta = 1.0;
		double yellow = 0.0;
		double black = 0.0;
		double white = 1-black;
		int red = (int)(255 * white * (1-cyan));
		int green = (int)(255 * white * (1-magenta));
		int blue = (int)(255 * white * (1-yellow));
		
		System.out.println("red = " + red);
		System.out.println("green = " + green);
		System.out.println("blue = " + blue);
		
		
	}
}
