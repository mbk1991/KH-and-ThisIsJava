package chap6;

public class CalculatorOverLoading {
	//���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	}
	
	//���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
