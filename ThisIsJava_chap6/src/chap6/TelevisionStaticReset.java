package chap6;

public class TelevisionStaticReset {
	//���� �ʱ�ȭ ���
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
