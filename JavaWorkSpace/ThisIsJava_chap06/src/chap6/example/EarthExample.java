package chap6.example;

import chap6.Earth;

public class EarthExample {
	public static void main(String[] args) {
		Earth earth = new Earth();
		
		System.out.println("지구의 반지름: " + earth.EARTH_RADIUS + "km");  //is not visible
		System.out.println("지구의 표면적: " + earth.EARTH_SURFACE_AREA + "km^2");
	}
}
