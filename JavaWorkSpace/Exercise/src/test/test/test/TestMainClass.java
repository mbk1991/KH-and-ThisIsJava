package test.test.test;

public class TestMainClass {

	public static void main(String[] args) {
		
//		String fileName = "image2.png";
//		
//		System.out.println("���� .Ȯ���� �и�");
//		System.out.println(fileName.substring(fileName.lastIndexOf(".")));
//		
//		
//		
//		//img�±��� src�� ��θ� ��������.
//		
//		String target="<p><img src=\"/resources/image/review/summerImageFiles/20220919164712.png\" style=\"width: 543px;\"><img src=\"/resources/image/review/summerImageFiles/20220919164617.png\" style=\"width: 678px;\">"
//				+ "</p><p><img src=\"/resources/image/review/summerImageFiles/20220920085349.png\" style=\"width: 25%;\"><br></p><p>�ٸ� ��ǻ�Ϳ����� �̹����� �� ��."
//				+ "</p><p>�̹��� ���� ������ �����ǰ� ���� �ʱ� ����.</p>";
//		
//		String regEx="[\"]";
//		
//		String[] sources = target.split(regEx);
//
//		int index = 0;
//		for(String source:sources) {
//			
//			if(source.contains("image")) {
//				System.out.println(index+" : "+source);
//			}
//			
//			index++;
//		}
//		
////		String regEx=""
		
		
		
	}
}



class MultiTab{
	private int sum;
	private MultiTab socket1;
	private MultiTab socket2;
	private MultiTab socket3;
	private MultiTab socket4;
	private MultiTab socket5;
	
	public MultiTab(int sum) {
		this.sum = sum;
	}
	
	public MultiTab(MultiTab socket1, MultiTab socket2, MultiTab socket3, MultiTab socket4, MultiTab socket5) {
		super();
		this.socket1 = socket1;
		this.socket2 = socket2;
		this.socket3 = socket3;
		this.socket4 = socket4;
		this.socket5 = socket5;
	}
	
	public int getSum() {
		sum = socket1.sum+
				socket2.sum+
				socket3.sum+
				socket4.sum+
				socket5.sum;
		return sum;
	}
}

class Electric extends MultiTab{
	private int sum;
	
	

	public Electric(MultiTab socket1, MultiTab socket2, MultiTab socket3, MultiTab socket4, MultiTab socket5) {
		super(socket1, socket2, socket3, socket4, socket5);
		// TODO Auto-generated constructor stub
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
