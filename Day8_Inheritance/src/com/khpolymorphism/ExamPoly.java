package com.khpolymorphism;

public class ExamPoly {
	public static void main(String[] args) {
	//up-casting
		Car car = new Sonata();
		car.move(10);
		car.stop();
	//down-casting
		((Sonata)car).moveSonata(); //The method moveSonata() is undefined for the type Car
		
	}
}
